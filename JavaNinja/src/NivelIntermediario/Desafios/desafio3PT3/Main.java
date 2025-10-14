package NivelIntermediario.Desafios.desafio3PT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xaxa = new Scanner(System.in);
        int opcao = 0;

        Ninja[] ninjas = new Ninja[0];

        while (opcao != 4) {
            System.out.println("==== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar Ninja: ");
            System.out.println("4. Sair");
            System.out.println("Digite sua opção: ");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("O ninja é um Uchiha? S/N");
                    String resposta = xaxa.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {
                        Ninja uchiha = lerUchiha(xaxa);
                        ninjas = adicionarNinja(ninjas, uchiha);

                        System.out.println("==== Ninja Cadastrado ====");
                    } else if (resposta.equalsIgnoreCase("n")) {
                        Ninja ninja = new Ninja();

                        ninjas = adicionarNinja(ninjas, lerNinja(xaxa, ninja));
                        System.out.println("==== Ninja Cadastrado ====");
                    } else {
                        System.out.println("Resposta Inválida! ");
                    }

                    break;
                case 2:
                    boolean temNinja = false;

                    System.out.println("==== Lista de Ninjas ====");
                    for (Ninja ninja : ninjas) {
                        ninja.mostrarInformacoes();
                        temNinja = true;
                    }

                    if (!temNinja) {
                        System.out.println("Nenhum Ninja encontrado! Por favor cadastre um Ninja.");
                    }
                    break;
                case 3:
                    atualizarNinja(xaxa, ninjas);
                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }


    }

    public static Ninja lerNinja(Scanner xaxa, Ninja ninja) {
        System.out.println("Digite o nome do ninja: ");
        ninja.nome = xaxa.nextLine();

        System.out.println("Digite o idade do ninja: ");
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

    public static Ninja lerUchiha(Scanner xaxa) {
        Uchiha uchiha = new Uchiha();
        lerNinja(xaxa, uchiha);

        System.out.println("Digite a habilidade especial: ");
        uchiha.habilidadeEspecial = xaxa.nextLine();

        return uchiha;
    }

    public static Ninja[] adicionarNinja(Ninja[] ninjas, Ninja ninja) {
        Ninja[] ninjasTemp = new Ninja[ninjas.length + 1];

        for (int i = 0; i < ninjas.length; i++) {
            ninjasTemp[i] = ninjas[i];
        }

        ninjasTemp[ninjasTemp.length - 1] = ninja;
        return ninjasTemp;
    }

    public static Ninja[] atualizarNinja(Scanner xaxa, Ninja[] ninjas) {
        boolean ninjaEncontrado = false;

        System.out.println("Digite o nome do ninja a ser atualizado: ");
        String nomeNinja = xaxa.nextLine();

        System.out.println("==== Atualizar Ninja ====");
        System.out.println("1. Editar Nome.");
        System.out.println("2. Editar Idade.");
        System.out.println("3. Editar Missão.");
        System.out.println("4. Editar Nível de Dificuldade.");
        System.out.println("5. Editar Status da missão.");
        System.out.println("6. Editar Habilidade Especial (Caso o ninja seja um Uchiha).");
        System.out.println("Digite sua opção: ");
        int opcao = xaxa.nextInt();
        xaxa.nextLine();

        switch (opcao) {
            case 1:
                for (int i = 0; i < ninjas.length; i++) {
                    if (nomeNinja.equalsIgnoreCase(ninjas[i].nome)) {
                        System.out.println("Digite o Novo Nome:");
                        ninjas[i].nome = xaxa.nextLine();

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }
                break;
            case 2:
                for (int i = 0; i < ninjas.length; i++) {
                    if (nomeNinja.equalsIgnoreCase(ninjas[i].nome)) {
                        System.out.println("Digite a Nova Idade:");
                        ninjas[i].idade = xaxa.nextInt();
                        xaxa.nextLine();

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }
                break;
            case 3:
                for (int i = 0; i < ninjas.length; i++) {
                    if (nomeNinja.equalsIgnoreCase(ninjas[i].nome)) {
                        System.out.println("Digite a Nova Missão:");
                        ninjas[i].missao = xaxa.nextLine();

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }
                break;
            case 4:
                for (int i = 0; i < ninjas.length; i++) {
                    if (nomeNinja.equalsIgnoreCase(ninjas[i].nome)) {
                        System.out.println("Digite o Novo Nível de Dificuldade:");
                        ninjas[i].nivelDificuldade = xaxa.nextLine();

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }
                break;
            case 5:
                for (int i = 0; i < ninjas.length; i++) {
                    if (nomeNinja.equalsIgnoreCase(ninjas[i].nome)) {
                        System.out.println("Digite o Novo Status da Missão:");
                        ninjas[i].statusMissao = xaxa.nextLine();

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }
                break;
            case 6:
                for (int i = 0; i < ninjas.length; i++) {
                    if (nomeNinja.equalsIgnoreCase(ninjas[i].nome)) {

                        if (ninjas[i] instanceof Uchiha) {
                            System.out.println("Digite a Nova Habilidade Especial:");
                            ((Uchiha) ninjas[i]).habilidadeEspecial = xaxa.nextLine();

                            ninjaEncontrado = true;
                            System.out.println("==== Ninja Atualizado ====");
                        } else {
                            System.out.println("Esse ninja não é um Uchiha.");
                            ninjaEncontrado = true;
                        }
                    }
                }
                break;
            default:
                System.out.println("Opção Inválida. Tente Novamente!");
                break;

        }

        if (!ninjaEncontrado)
            System.out.println("Ninja não encontrado!");

        return ninjas;
    }
}
