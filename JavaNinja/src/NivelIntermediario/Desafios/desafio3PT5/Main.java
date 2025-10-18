package NivelIntermediario.Desafios.desafio3PT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xaxa = new Scanner(System.in);
        int opcao = 0;

        Ninja[] ninjas = new Ninja[0];

        while (opcao != 6) {
            System.out.println("==== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Buscar Ninja por Nome");
            System.out.println("4. Atualizar Ninja");
            System.out.println("5. Deletar Ninja");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("O ninja é um Uchiha? S/N");
                    String resposta = xaxa.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {
                        ninjas = adicionarNinja(ninjas, lerUchiha(xaxa));

                    } else if (resposta.equalsIgnoreCase("n")) {
                        Ninja ninja = new Ninja();
                        lerNinja(xaxa, ninja);

                        ninjas = adicionarNinja(ninjas, ninja);
                    } else {
                        System.out.println("Resposta Inválida!");
                    }

                    break;
                case 2:
                    buscarTodos(ninjas);
                    break;
                case 3:
                    System.out.println("Digite o nome do ninja a ser procurado: ");
                    String nome = xaxa.nextLine();

                    Ninja ninja = buscarPorNome(ninjas, nome);

                    if (ninja != null) {
                        ninja.mostrarInformacoes();
                    } else {
                        System.out.println("Ninja não encontrado!");
                    }
                    break;
                case 4:
                    atualizarNinja(xaxa, ninjas);
                    break;
                case 5:
                    System.out.println("Digite o nome do ninja a ser deletado: ");
                    String ninjaASerDeletado = xaxa.nextLine();

                    ninjas = removerPorNome(ninjas, ninjaASerDeletado);
                    break;
                case 6:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente Novamente!");
                    break;
            }
        }

    }

    public static Ninja lerNinja(Scanner xaxa, Ninja ninja) {
        System.out.println("Digite o nome do ninja: ");
        ninja.nome = xaxa.nextLine();

        System.out.println("Digite a idade do ninja: ");
        ninja.idade = xaxa.nextInt();
        xaxa.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite a missão do ninja: ");
        ninja.missao = xaxa.nextLine();

        System.out.println("Digite o nível de dificuldade da missão: ");
        ninja.nivelDificuldade = xaxa.nextLine();

        System.out.println("Digite o status da missão: ");
        ninja.statusMissao = xaxa.nextLine();

        return ninja;
    }

    public static Ninja lerUchiha(Scanner xaxa) {
        Uchiha uchiha = new Uchiha();
        lerNinja(xaxa, uchiha);

        System.out.println("Digite a habilidade especial do ninja: ");
        uchiha.habilidadeEspecial = xaxa.nextLine();

        return uchiha;
    }

    public static Ninja[] adicionarNinja(Ninja[] ninjas, Ninja ninja) {

        Ninja ninjaTemp = buscarPorNome(ninjas, ninja.nome);

        if (ninjaTemp == null) {
            Ninja[] ninjasTemp = new Ninja[ninjas.length + 1];

            for (int i = 0; i < ninjas.length; i++) {
                ninjasTemp[i] = ninjas[i];
            }
            ninjasTemp[ninjasTemp.length - 1] = ninja;
            System.out.println("Ninja Cadastrado");

            return ninjasTemp;
        } else {
            System.out.println("Ninja ja existe na lista.");
            return ninjas;
        }
    }

    public static void buscarTodos(Ninja[] ninjas) {
        System.out.println("==== Lista de Ninjas ====");
        if (ninjas.length != 0) {
            for (int i = 0; i < ninjas.length; i++) {
                if (ninjas[i] != null) {
                    ninjas[i].mostrarInformacoes();
                    System.out.println("===========================");
                }
            }
        } else {
            System.out.println("Nenhum Ninja encontrado!");
        }
    }

    public static Ninja buscarPorNome(Ninja[] ninjas, String nome) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                return ninjas[i];
            }
        }

        return null;
    }

    public static Ninja[] atualizarNinja(Scanner xaxa, Ninja[] ninjas) {
        System.out.println("Digite o nome do ninja a ser atualizado: ");
        String nomeASerAtualizado = xaxa.nextLine();

        Ninja ninja = buscarPorNome(ninjas, nomeASerAtualizado);

        if (ninja != null) {
            System.out.println("==== Menu para Atualizar ====");
            System.out.println("1. Atualizar Nome.");
            System.out.println("2. Atualizar Idade.");
            System.out.println("3. Atualizar Missão.");
            System.out.println("4. Atualizar Nível de Dificuldade.");
            System.out.println("5. Atualizar Status da Missão.");
            System.out.println("6. Atualizar Habilidade Especial (Caso seja Uchiha).");
            System.out.println("Digite sua opção: ");
            int opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o novo nome do ninja: ");
                    ninja.nome = xaxa.nextLine();
                    System.out.println("Ninja Atualizado");
                    break;
                case 2:
                    System.out.println("Digite a nova idade do ninja: ");
                    ninja.idade = xaxa.nextInt();
                    xaxa.nextLine();
                    System.out.println("Ninja Atualizado");
                    break;
                case 3:
                    System.out.println("Digite a nova missão do ninja: ");
                    ninja.missao = xaxa.nextLine();
                    System.out.println("Ninja Atualizado");
                    break;
                case 4:
                    System.out.println("Digite o novo nível de dificuldade: ");
                    ninja.nivelDificuldade = xaxa.nextLine();
                    System.out.println("Ninja Atualizado");
                    break;
                case 5:
                    System.out.println("Digite o novo Status da missão: ");
                    ninja.statusMissao = xaxa.nextLine();
                    System.out.println("Ninja Atualizado");
                    break;
                case 6:
                    if (ninja instanceof Uchiha) {
                        System.out.println("Digite a nova Habilidade Especial: ");
                        ((Uchiha) ninja).habilidadeEspecial = xaxa.nextLine();
                        System.out.println("Uchiha Atualizado");
                    } else {
                        System.out.println("O ninja não é um Uchiha");
                    }
                    break;
            }

        } else {
            System.out.println("Ninja não encontrado! ");
        }

        return ninjas;
    }

    public static Ninja[] removerPorNome(Ninja[] ninjas, String nome) {
        if (buscarPorNome(ninjas, nome) != null) {
            Ninja[] ninjasTemp = new Ninja[ninjas.length - 1];

            int j = 0;
            for (int i = 0; i < ninjas.length; i++) {
                if (!ninjas[i].nome.equalsIgnoreCase(nome)) {
                    ninjasTemp[j] = ninjas[i];
                    j++;
                }
            }

            System.out.println("Ninja Deletado!");

            return ninjasTemp;
        } else {
            System.out.println("Ninja não encontrado!");
        }

        return ninjas;
    }
}
