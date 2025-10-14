package NivelBasico.Desafios;

import java.util.Scanner;

public class Desafio2PT2 {
    public static void main(String[] args) {
        Scanner xaxa = new Scanner(System.in);
        int opcao = 0;

        String[] ninjas = new String[1];

        while (opcao != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do ninja:");
                    String nome = xaxa.nextLine();

                    String[] novoArray = new String[ninjas.length + 1];
                    for (int i = 0; i < ninjas.length; i++) {
                        novoArray[i] = ninjas[i];
                    }
                    novoArray[novoArray.length - 1] = nome;
                    ninjas = novoArray;
                    break;
                case 2:
                    boolean temNinja = false;

                    System.out.println("\n===== Lista de Ninjas =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjas[i] != null) {
                            System.out.println(ninjas[i]);
                            temNinja = true;
                        }
                    }
                    if (!temNinja) {
                        System.out.println("Nenhum ninja encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do ninja a ser deletado:");
                    String ninjaDeletado = xaxa.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < ninjas.length; i++) {
                        if(ninjaDeletado.equalsIgnoreCase(ninjas[i])) {
                            ninjas[i] = null;
                            System.out.println(ninjaDeletado + " foi deletado!");
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Ninja não encontrado");
                    }

                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;

            }

        }




    }
}
