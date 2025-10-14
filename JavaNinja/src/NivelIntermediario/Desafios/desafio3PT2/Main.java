package NivelIntermediario.Desafios.desafio3PT2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xaxa = new Scanner(System.in);
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
                    System.out.println("O ninja é um Uchiha? S/N");
                    String resposta = xaxa.nextLine();

                    if(resposta.equalsIgnoreCase("s")) {
                        Ninja novoUchiha = lerUchiha(xaxa);
                        ninjas = adicionarNinja(ninjas, novoUchiha);

                    } else if (resposta.equalsIgnoreCase("n")) {
                        Ninja novoNinja = new Ninja();
                        lerNinja(xaxa, novoNinja);
                        ninjas = adicionarNinja(ninjas, novoNinja);

                    } else {
                        System.out.println("Resposta Inválida");
                    }
                    break;
                case 2:
                    boolean temNinja = false;

                    System.out.println("==== Lista de Ninjas ====");
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null) {
                            ninjas[i].mostrarInformacoes();

                            temNinja = true;
                        }
                    }

                    if(!temNinja) {
                        System.out.println("Lista vazia. Por favor adicione um Ninja!");
                    }

                    break;
                case 3:
                    atualizarNinja(xaxa, ninjas);
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
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

        System.out.println("Digite a idade do ninja: ");
        ninja.idade = xaxa.nextInt();
        xaxa.nextLine();

        System.out.println("Digite a missão do ninja: ");
        ninja.missao = xaxa.nextLine();

        System.out.println("Digite o Nível de Dificuldade da Missão: ");
        ninja.nivelDificuldade = xaxa.nextLine();

        System.out.println("Digite o Status da Missão: ");
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
        Ninja[] novoVetor = new Ninja[ninjas.length + 1];

        for (int i = 0; i < ninjas.length; i++) {
            novoVetor[i] = ninjas[i];
        }
        novoVetor[novoVetor.length - 1] = ninja;

        return novoVetor;
    }

    public static Ninja[] atualizarNinja(Scanner xaxa, Ninja[] ninjas){
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
                System.out.println("Digite o novo nome: ");
                String novoNome = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].nome = novoNome;

                        ninjaEncontrado = true;
                        System.out.println("Ninja Atualizado");
                    }
                }
                break;
            case 2:
                System.out.println("Digite a nova idade: ");
                int novaIdade = xaxa.nextInt();

                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].idade = novaIdade;

                        ninjaEncontrado = true;
                        System.out.println("Ninja Atualizado");
                    }
                }
                break;
            case 3:
                System.out.println("Digite a nova missão: ");
                String novaMissao= xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].missao = novaMissao;

                        ninjaEncontrado = true;
                        System.out.println("Ninja Atualizado");
                    }
                }
                break;
            case 4:
                System.out.println("Digite o novo Nível de Dificuldade: ");
                String novaDificuldade = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].nivelDificuldade = novaDificuldade;

                        ninjaEncontrado = true;
                        System.out.println("Ninja Atualizado");
                    }
                }
                break;
            case 5:
                System.out.println("Digite o novo Status da Missão: ");
                String novoStatus = xaxa.nextLine();

                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjas[i].nome.equalsIgnoreCase(nome)) {
                        ninjas[i].statusMissao = novoStatus;

                        ninjaEncontrado = true;
                        System.out.println("Ninja Atualizado");
                    }
                }
                break;
            case 6:
                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjas[i].nome.equalsIgnoreCase(nome) && ninjas[i] instanceof Uchiha) {
                        System.out.println("Digite a nova Habilidade Especial: ");
                        ((Uchiha) ninjas[i]).habilidadeEspecial = xaxa.nextLine();
                    }
                }

                break;
            default:
                System.out.println("Opção Inválida. Tente Novamente!");
                break;
        }

        return ninjas;
    }

}
