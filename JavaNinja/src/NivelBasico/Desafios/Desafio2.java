package NivelBasico.Desafios;

import java.sql.SQLOutput;
import java.util.*;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner xaxa = new Scanner(System.in);
        int opcao = 0;
        String[] ninjas = new String[0];

        while(opcao != 4){
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
                    // Pedir ao usuário para digitar o nome do ninja
                    System.out.println("Digite o nome do ninja: ");
                    String nome = xaxa.nextLine();

                    // Criando e atualizando o novo vetor.
                    String[] novoVetor = new String[ninjas.length + 1];
                    for (int i = 0; i < ninjas.length; i++) {
                        novoVetor[i] = ninjas[i];
                    }

                    // Inserindo o nome cadastrado
                    novoVetor[novoVetor.length - 1] = nome;
                    System.out.println("===== Ninja Cadastrado =====");

                    // Atualizando o vetor antigo
                    ninjas = novoVetor;
                    break;
                case 2:
                    // Variável vai começar em false, como se não tivesse ninja
                    boolean temNinja = false;

                    System.out.println("===== Lista de ninjas =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        // Lógica para ver se tem ninja no Array
                        if (ninjas[i] != null) {
                            System.out.println(ninjas[i]);

                            // Como a condição é para encontrar um ninja, então a variável vai mudar.
                            temNinja = true;
                        }
                    }

                    // Se colocasse o if sem a !, encontraria o ninja e não entraria no bloco de código.
                    if (!temNinja) {
                        System.out.println("Nenhum ninja encontrado");
                    }

                    break;
                case 3:
                    // Pedir ao usuário para digitar o nome do ninja a ser deletado
                    System.out.println("Digite o nome do ninja a ser deletado");
                    String ninjaDeletado = xaxa.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < ninjas.length; i++) {

                        // Verificar se o nome passado pelo usuário está na lista, ignorando se a letra esta em maiúscula ou minúscula.
                        if(ninjaDeletado.equalsIgnoreCase(ninjas[i])) {
                            ninjas[i] = null;

                            // Se for encontrado, muda o valor da variável.
                            encontrado = true;
                        }
                    }

                    // Condição para ver se o ninja foi encontrado ou não.
                    System.out.println(encontrado ? "Ninja encontrado e deletado" : "Ninja não encontrado");
                    break;
                case 4:
                    // Encerrando
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    // Caso o usuário digite alguma coisa diferente das opções.
                    System.out.println("Opção inválida");
                    break;
            }

        }
    }
}
