package NivelIntermediario.Desafios.desafio3PT4;

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
                    System.out.println("O ninja é um Uchiha? (s/n)");
                    String resposta = xaxa.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {
                        Uchiha uchiha = lerUchiha(xaxa);
                        ninjas = adicionarNinja(ninjas, uchiha);

                        System.out.println("Uchiha cadastrado com sucesso!");
                    } else if (resposta.equalsIgnoreCase("n")) {
                        Ninja ninja = new Ninja();
                        lerNinja(xaxa, ninja);
                        ninjas = adicionarNinja(ninjas, ninja);

                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Resposta inválida. Tente novamente.");
                    }

                    break;
                case 2:

                    if (ninjas.length == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("==== Lista de Ninjas ====");
                        for (Ninja ninja : ninjas) {
                            if (ninja != null) {
                                ninja.mostrarInformacoes();
                                System.out.println("-----------------------");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do ninja que deseja buscar: ");
                    String nome = xaxa.nextLine();

                    Ninja ninja = buscarPorNome(nome, ninjas);

                    if (ninja != null) {
                        ninja.mostrarInformacoes();
                    } else {
                        System.out.println("Ninja não encontrado.");
                    }

                    break;
                case 4:
                    atualizarNinja(xaxa, ninjas);
                    break;
                case 5:
                    ninjas =deletarNinja(xaxa, ninjas);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static Ninja lerNinja(Scanner xaxa, Ninja ninja) {
        System.out.println("Digite o nome do ninja: ");
        ninja.nome = xaxa.nextLine();

        System.out.println("Digite a idade do ninja: ");
        ninja.idade = xaxa.nextInt();
        xaxa.nextLine();

        System.out.println("Digite a missão do ninja: ");
        ninja.missao = xaxa.nextLine();

        System.out.println("Digite o nível de dificuldade da missão: ");
        ninja.nivelDificuldade = xaxa.nextLine();

        System.out.println("Digite o status da missão: ");
        ninja.statusMissao = xaxa.nextLine();

        return ninja;
    }

    public static Uchiha lerUchiha(Scanner xaxa) {
        Uchiha uchiha = new Uchiha();
        lerNinja(xaxa, uchiha);

        System.out.println("Digite a habilidade especial do Uchiha: ");
        uchiha.habilidadeEspecial = xaxa.nextLine();

        return uchiha;
    }

    public static Ninja[] adicionarNinja(Ninja[] ninjas, Ninja novoNinja) {
        boolean ninjaExiste = false;

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i].nome.equalsIgnoreCase(novoNinja.nome)) {
                System.out.println("Ninja com esse nome já existe. Não é possível adicionar.");
                ninjaExiste = true;
                break;
            }
        }

        if (!ninjaExiste) {
            Ninja[] ninjasTemp = new Ninja[ninjas.length + 1];

            for (int x = 0; x < ninjas.length; x++) {
                ninjasTemp[x] = ninjas[x];
            }
            ninjasTemp[ninjasTemp.length - 1] = novoNinja;
            ninjas = ninjasTemp;
        }

        return ninjas;
    }

    public static Ninja[] atualizarNinja(Scanner xaxa, Ninja[] ninjas) {

        System.out.println("Digite o nome do ninja que deseja atualizar: ");
        String nome = xaxa.nextLine();

        Ninja ninja = buscarPorNome(nome, ninjas);

        if (ninja == null) {
            System.out.println("Ninja não encontrado.");
            return ninjas;
        }

        System.out.println("Digite a opcao que deseja atualizar: ");
        System.out.println("1. Nome");
        System.out.println("2. Idade");
        System.out.println("3. Missao");
        System.out.println("4. Nivel de Dificuldade");
        System.out.println("5. Status da Missao");
        System.out.println("6. Habilidade Especial (Caso seja Uchiha).");
        int opcao = xaxa.nextInt();
        xaxa.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo nome do ninja: ");
                ninja.nome = xaxa.nextLine();
                System.out.println("Nome atualizado com sucesso!");
                break;
            case 2:
                System.out.println("Digite a nova idade do ninja: ");
                ninja.idade = xaxa.nextInt();
                System.out.println("Idade atualizada com sucesso!");
                break;
            case 3:
                System.out.println("Digite a nova missão do ninja: ");
                ninja.missao = xaxa.nextLine();
                System.out.println("Missão atualizada com sucesso!");
                break;
            case 4:
                System.out.println("Digite o novo Nível de Dificuldade: ");
                ninja.nivelDificuldade = xaxa.nextLine();
                System.out.println("Nível de Dificuldade atualizada com sucesso!");
                break;
            case 5:
                System.out.println("Digite o novo Status da missão: ");
                ninja.statusMissao = xaxa.nextLine();
                System.out.println("Status da missão atualizada com sucesso!");
                break;
            case 6:
                for (int i = 0; i < ninjas.length; i++) {
//                    if (ninjas[i].nome.equalsIgnoreCase(nome) && ninjas[i] instanceof Uchiha) {
//                        System.out.println("Digite a nova Habilidade Especial do Uchiha: ");
//                        ((Uchiha) ninjas[i]).habilidadeEspecial = xaxa.nextLine();
//
//                        System.out.println("Habilidade Especial atualizada com sucesso!");
//                        ninjaEncontrado = true;
//                    }

                    if (ninjas[i] instanceof Uchiha) {
                        System.out.println("Digite a nova Habilidade Especial: ");
                        ((Uchiha) ninja).habilidadeEspecial = xaxa.nextLine();
                        System.out.println("Habilidade Especial atualizada com sucesso!");
                    } else {
                        System.out.println("O ninja não é um Uchiha.");
                    }
                    break;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        return ninjas;
    }

    public static Ninja[] deletarNinja(Scanner xaxa, Ninja[] ninjas) {
        System.out.println("Digite o nome do ninja que deseja deletar: ");
        String nome = xaxa.nextLine();

        Ninja ninja = buscarPorNome(nome, ninjas);

        if (ninja == null) {
            System.out.println("Ninja não encontrado.");
            return ninjas;
        }

        Ninja[] ninjasTemp = new Ninja[ninjas.length - 1];

        int j = 0;
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] != ninja) {
                ninjasTemp[j] = ninjas[i];
                j++;
            }
        }

        System.out.println("Ninja deletado com sucesso.");
        return ninjasTemp;
    }

    public static Ninja buscarPorNome(String nome, Ninja[] ninjas) {

        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                return ninjas[i];
            }
        }

        return null;
    }
}
