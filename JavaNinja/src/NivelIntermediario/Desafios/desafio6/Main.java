package NivelIntermediario.Desafios.desafio6;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner xaxa = new Scanner(System.in);
        int opcao = 0;

                // Iniciar uma LinkedList com 7 ninjas
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Aldeia da folha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Aldeia da folha", 18));
        ninjas.add(new Ninja("Sakura Haruno", "Aldeia da folha", 18));
        ninjas.add(new Ninja("Kakashi Hatake", "Aldeia da folha", 27));
        ninjas.add(new Ninja("Hinata Hyuga", "Aldeia da folha", 17));
        ninjas.add(new Ninja("Neji Hyuga", "Aldeia da folha", 18));
        ninjas.add(new Ninja("Itachi Uchiha", "Renegado", 21));


        while (opcao != 7) {
            System.out.println("==== MENU ====");
            System.out.println("1. Listar os ninjas");
            System.out.println("2. Adicionar um ninja");
            System.out.println("3. Remover um ninja");
            System.out.println("4. Buscar ninja por index");
            System.out.println("5. Buscar ninja por nome");
            System.out.println("6. Ordenar lista de ninjas");
            System.out.println("7. Sair");

            System.out.println("Digite a opção desejada: ");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {

                // Listar os ninjas
                case 1:
                    for (Ninja ninja : ninjas) {
                        System.out.println(ninja.toString());
                        System.out.println("=====================================");
                    }
                    break;

                // Adicionar um ninja no início da lista
                case 2:
                    boolean temNinja = false;

                    Ninja novoNinja = new Ninja();
                    lerNinja(xaxa, novoNinja);

                    for (Ninja ninja : ninjas) {
                        if (ninja.getNome().equalsIgnoreCase(novoNinja.getNome())) {
                            System.out.println("Ja existe um ninja com esse nome.");
                            temNinja = true;
                            break;
                        }
                    }

                    if (!temNinja) {
                        ninjas.addFirst(novoNinja);
                        System.out.println("Ninja adicionado com sucesso!");
                    }

                    break;

                // Remover um ninja do início da lista
                case 3:
                    if (ninjas.isEmpty()) {
                        System.out.println("Lista vazia!");
                    } else {
                        String nome = ninjas.getFirst().getNome();
                        ninjas.removeFirst();
                        System.out.println(nome + " foi removido com sucesso!");
                    }
                    break;

                // Procurar um ninja por index
                case 4:
                    System.out.println("Digite o index desejado: ");
                    int index = xaxa.nextInt();
                    xaxa.nextLine();

                    if (index >= ninjas.size() || index < 0) {
                        System.out.println("Ninja não encontrado");
                    } else {
                        Ninja ninjaProcurado = ninjas.get(index);
                        System.out.println(ninjaProcurado.toString());
                    }


                    break;

                // Procurar um ninja por Nome
                case 5:
                    boolean ninjaEncontradoPorNome = false;

                    System.out.println("Digite o nome desejado: ");
                    String nomeProcurado = xaxa.nextLine();

                    for (Ninja n : ninjas) {
                        if (n.getNome().equalsIgnoreCase(nomeProcurado)) {
                            System.out.println(n.toString());
                            ninjaEncontradoPorNome = true;
                        }
                    }

                    if (!ninjaEncontradoPorNome) {
                        System.out.println("Ninja não encontrado");
                    }
                    break;

                // Ordenar por Nome, Idade ou aldeia
                case 6:
                    System.out.println("==== MENU ORDENAÇÃO ====");
                    System.out.println("1. Ordenar por Nome");
                    System.out.println("2. Ordenar por Aldeia");
                    System.out.println("3. Ordenar por Idade");
                    System.out.println("4. Sair");
                    System.out.println("Digite sua opção: ");
                    int ordenacao = xaxa.nextInt();
                    xaxa.nextLine();

                    switch (ordenacao) {
                        case 1:
                            ninjas.sort(Comparator.comparing(Ninja::getNome));
                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja.toString());
                                System.out.println("=====================================");
                            }
                            System.out.println("Lista ordenada com sucesso!");
                            break;
                        case 2:
                            ninjas.sort(Comparator.comparing(Ninja::getAldeia));
                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja.toString());
                                System.out.println("=====================================");
                            }
                            System.out.println("Lista ordenada com sucesso!");
                            break;
                        case 3:
                            ninjas.sort(Comparator.comparing(Ninja::getIdade));
                            for (Ninja ninja : ninjas) {
                                System.out.println(ninja.toString());
                                System.out.println("=====================================");
                            }
                            System.out.println("Lista ordenada com sucesso!");
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }

                    break;

                // Sair
                case 7:
                    System.out.println("Finalizando programa...");
                    break;

                // Opção inválida
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    public static Ninja lerNinja(Scanner xaxa, Ninja ninja) {
        System.out.println("Digite o nome do ninja: ");
        ninja.setNome(xaxa.nextLine());

        System.out.println("Digite a aldeia do ninja: ");
        ninja.setAldeia(xaxa.nextLine());

        System.out.println("Digite a idade do ninja: ");
        ninja.setIdade(xaxa.nextInt());
        xaxa.nextLine();

        return ninja;
    }
}
