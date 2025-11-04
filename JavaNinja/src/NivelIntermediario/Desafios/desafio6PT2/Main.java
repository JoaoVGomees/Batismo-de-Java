package NivelIntermediario.Desafios.desafio6PT2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criar uma LinkedList e adicionar 7 ninjas
        LinkedList<Ninja> ninjas = new LinkedList<>();
        ninjas.add(new Ninja("Naruto", 18, "Konoha"));
        ninjas.add(new Ninja("Sasuke", 18, "Konoha"));
        ninjas.add(new Ninja("Sakura", 18, "Konoha"));
        ninjas.add(new Ninja("Kakashi", 26, "Konoha"));
        ninjas.add(new Ninja("Itachi", 23, "Konoha"));
        ninjas.add(new Ninja("Temari", 18, "Areia"));
        ninjas.add(new Ninja("Gaara", 18, "Areia"));

        // Listar todos ninjas na lista
        System.out.println("======== Lista de Ninjas ========");
        for (Ninja ninja : ninjas) {
            System.out.println(ninja.toString());
            System.out.println("====");
        }

        // Adicionar um Ninja no início da Lista
        ninjas.addFirst(new Ninja("Zabuza", 35, "Névoa"));
        System.out.println(ninjas);

        System.out.println("==========================================");

        // Remover um Ninja no início da Lista
        ninjas.removeFirst();
        System.out.println(ninjas);

        System.out.println("==========================================");

        // Procurar um Ninja específico na lista
        System.out.println(ninjas.get(3));

        // Ordenação de elementos
        Scanner xaxa = new Scanner(System.in);
        System.out.println("==== Menu Ordenação ====");
        System.out.println("1. Ordenar por nome");
        System.out.println("2. Ordenar por idade");
        System.out.println("3. Ordenar por aldeia");
        System.out.println("Digite sua opção: ");
        int opcao = xaxa.nextInt();
        xaxa.nextLine();

        switch (opcao) {
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

        System.out.println("==========================================");

        System.out.println("Digite o nome do ninja a ser procurado: ");
        String nome = xaxa.nextLine();

        for (Ninja ninja : ninjas) {
            if(ninja.getNome().equalsIgnoreCase(nome)) {
                System.out.println(ninja.toString());
            }
        }

    }
}
