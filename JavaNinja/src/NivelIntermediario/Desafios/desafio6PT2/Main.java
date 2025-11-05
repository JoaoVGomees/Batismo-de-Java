package NivelIntermediario.Desafios.desafio6PT2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner xaxa = new Scanner(System.in);
        int opcao = 0;

        // Criar uma LinkedList e adicionar 7 ninjas
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(new Ninja("Naruto", 18, "Konoha"));
        ninjas.add(new Ninja("Sasuke", 18, "Konoha"));
        ninjas.add(new Ninja("Sakura", 18, "Konoha"));
        ninjas.add(new Ninja("Kakashi", 26, "Konoha"));
        ninjas.add(new Ninja("Itachi", 23, "Konoha"));
        ninjas.add(new Ninja("Temari", 18, "Areia"));
        ninjas.add(new Ninja("Gaara", 18, "Areia"));

        while(opcao != 7) {
            System.out.println("--------- Menu Ninja ---------");
            System.out.println("1. Lista de ninjas");
            System.out.println("2. Adicionar ninja");
            System.out.println("3. Remover ninja");
            System.out.println("4. Buscar ninja por index");
            System.out.println("5. Buscar ninja por nome");
            System.out.println("6. Lista personalizada");
            System.out.println("7. Sair");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    // Listar todos ninjas na lista
                    if (ninjas.isEmpty()) {
                        System.out.println("Lista vazia!");
                    } else {
                        System.out.println("======== Lista de Ninjas ========");
                        for (Ninja ninja : ninjas) {
                            System.out.println(ninja.toString());
                            System.out.println("====");
                        }
                    }
                    break;
                case 2:
                    // Adicionar um Ninja no início da Lista
                    ninjas.addFirst(lerNinja(xaxa));
                    System.out.println("Ninja adicionado no início com sucesso!");
                    break;
                case 3:
                    // Remover um Ninja no início da Lista
                    if (ninjas.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        ninjas.removeFirst();
                        System.out.println("Primeiro ninja removido com sucesso!");
                    }
                    break;
                case 4:
                    // Procurar um Ninja específico na lista por index
                    System.out.println("Digite o index do ninja a ser removido: ");
                    int indexNinjaASerRemovido = xaxa.nextInt();
                    xaxa.nextLine();

                    if (indexNinjaASerRemovido >= 0 && indexNinjaASerRemovido < ninjas.size()) {
                        Ninja ninjaRemovido = ninjas.remove(indexNinjaASerRemovido);
                        System.out.println(ninjaRemovido.getNome() + " foi removido com sucesso!");
                    } else {
                        System.out.println("Index inválido, tente novamente");
                    }
                    break;
                case 5:
                    // Procurar um Ninja específico na lista por nome
                    boolean ninjaEncontrado = false;

                    System.out.println("Digite o nome do ninja a ser procurado: ");
                    String nomeNinjaASerProcurado = xaxa.nextLine();

                    for (Ninja ninja : ninjas) {
                        if(ninja.getNome().equalsIgnoreCase(nomeNinjaASerProcurado)) {
                            System.out.println(ninja.toString());
                            ninjaEncontrado = true;
                        }
                    }

                    if (!ninjaEncontrado) {
                        System.out.println("Ninja não encontrado! ");
                    }

                    break;
                case 6:
                    // Ordenação de elementos
                    System.out.println("==== Menu Ordenação ====");
                    System.out.println("1. Ordenar por nome");
                    System.out.println("2. Ordenar por idade");
                    System.out.println("3. Ordenar por aldeia");
                    System.out.println("Digite sua opção: ");
                    int resposta = xaxa.nextInt();
                    xaxa.nextLine();

                    switch (resposta) {
                        case 1:
                            System.out.println("======== Lista de Ninjas Ordenada por Nome ========");
                            ninjas.sort(Comparator.comparing(Ninja::getNome));

                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja.toString());
                                System.out.println("====");
                            }
                            break;
                        case 2:
                            System.out.println("======== Lista de Ninjas Ordenada por Idade ========");
                            ninjas.sort(Comparator.comparing(Ninja::getIdade));

                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja.toString());
                                System.out.println("====");
                            }
                            break;
                        case 3:
                            System.out.println("======== Lista de Ninjas Ordenada por Aldeia ========");
                            ninjas.sort(Comparator.comparing(Ninja::getAldeia));

                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja.toString());
                                System.out.println("====");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;

            }
        }
    }

    public static Ninja lerNinja(Scanner xaxa) {
        System.out.println("Digite o nome do ninja: ");
        String nome = xaxa.nextLine();

        System.out.println("Digite a aldeia do ninja: ");
        String aldeia = xaxa.nextLine();

        System.out.println("Digite a idade do ninja: ");
        int idade = xaxa.nextInt();
        xaxa.nextLine();

        return new Ninja(nome, idade, aldeia);
    }
}
