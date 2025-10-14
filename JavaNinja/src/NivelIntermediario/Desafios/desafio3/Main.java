package NivelIntermediario.Desafios.desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xaxa= new Scanner(System.in);
        int opcao = 0;

        Ninja[] ninjas = new Ninja[0];

        while(opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("O seu ninja é um Uchiha? S/N");
                    String resposta = xaxa.nextLine();

                    if(resposta.equalsIgnoreCase("s")) {
                        Uchiha novoNinja = lerUchiha(xaxa);

                        ninjas = adicionarNinja(ninjas, novoNinja);
                        System.out.println("===== Ninja Cadastrado =====");

                    } else if (resposta.equalsIgnoreCase("n")) {
                        Ninja novoNinja = new Ninja();
                        lerNinja(xaxa, novoNinja);

                        ninjas = adicionarNinja(ninjas, novoNinja);
                        System.out.println("===== Ninja Cadastrado =====");
                    } else {
                        System.out.println("Opção inválida");
                    }

                    break;
                case 2:
                    boolean temNinja = false;

                    System.out.println("===== Lista de ninjas =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null) {
                            ninjas[i].mostrarInformacoes();

                            temNinja = true;
                        }
                    }

                    if (!temNinja) {
                        System.out.println("Nenhum ninja encontrado");
                    }
                    break;
                case 3:
                    atualizarNinja(ninjas, xaxa);
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }

    public static void lerNinja(Scanner xaxa, Ninja ninja) {
        System.out.println("Digite o novo nome do ninja: ");
        ninja.nome = xaxa.nextLine();

        System.out.println("Digite a idade do ninja: ");
        ninja.idade = xaxa.nextInt();
        xaxa.nextLine();

        System.out.println("Digite a missão do ninja: ");
        ninja.missao = xaxa.nextLine();

        System.out.println("Digite o nível da dificuldade: ");
        ninja.nivelDificuldade = xaxa.nextLine();

        System.out.println("Digite o status da missão: ");
        ninja.statusMissao = xaxa.nextLine();
    }

    public static Uchiha lerUchiha(Scanner xaxa) {
        Uchiha uchiha = new Uchiha();
        lerNinja(xaxa, uchiha);

        System.out.println("Digite a habilidade especial do ninja: ");
        uchiha.habilidadeEspecial = xaxa.nextLine();

        return uchiha;
    }

    public static Ninja[] adicionarNinja(Ninja[] ninjas, Ninja novoNinja) {
        Ninja[] novoVetor = new Ninja[ninjas.length + 1];
        for (int i = 0; i < ninjas.length; i++) {
            novoVetor[i] = ninjas[i];
        }

        novoVetor[novoVetor.length - 1] = novoNinja;
        ninjas = novoVetor;
        return ninjas;
    }

    public static Ninja[] atualizarNinja(Ninja[] ninjas, Scanner xaxa) {
        boolean ninjaEncontrado = false;

        System.out.println("Digite o nome do ninja a ser atualizado: ");
        String nome = xaxa.nextLine();

        System.out.println("\n===== Menu para Atualizar o ninja =====");
        System.out.println("1. Mudar o nome do ninja");
        System.out.println("2. Mudar a idade do ninja");
        System.out.println("3. Mudar a Missão do ninja");
        System.out.println("4. Mudar o Nível de Dificuldade da missão");
        System.out.println("5. Mudar o Status da Missão.");
        System.out.println("6. Mudar a habilidade especial do Ninja");
        System.out.print("Escolha uma opção: ");
        int opcaoAtualizar = xaxa.nextInt();
        xaxa.nextLine();

        switch (opcaoAtualizar) {
            case 1:
                System.out.println("Digite o novo nome do ninja: ");
                String novoNome = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if(ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].nome = novoNome;

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }

                break;
            case 2:
                System.out.println("Digite a nova idade: ");
                int novaIdade = xaxa.nextInt();

                for (int i = 0; i < ninjas.length; i++) {
                    if(ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].idade = novaIdade;

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }

                break;
            case 3:
                System.out.println("Digite a nova missão: ");
                String novaMissao = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if(ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].missao = novaMissao;

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }

                break;
            case 4:
                System.out.println("Digite a nova dificuldade da missão: ");
                String novoNivelDificuldade = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if(ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].nivelDificuldade = novoNivelDificuldade;

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }

                break;
            case 5:
                System.out.println("Digite o novo Status da missão: ");
                String novoStatusMissao = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if(ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].statusMissao = novoStatusMissao;

                        ninjaEncontrado = true;
                        System.out.println("==== Ninja Atualizado ====");
                    }
                }
                break;
            case 6:


                for (int i = 0; i < ninjas.length; i++) {
                    if(ninjas[i].nome.equalsIgnoreCase(nome)) {
                        if(ninjas[i] instanceof Uchiha) {
                            System.out.println("Digite a nova habilidade especial: ");
                            ((Uchiha) ninjas[i]).habilidadeEspecial = xaxa.nextLine();

                            ninjaEncontrado = true;
                            System.out.println("==== Ninja Atualizado ====");
                        } else {
                            System.out.println("Esse ninja não é um Uchiha");
                        }

                    }
                }
                break;
            default: {
                System.out.println("Opção inválida");
            }
        }

        if(!ninjaEncontrado) {
            System.out.println("Ninja não encontrado!");
        }
        return ninjas;
    }

}
