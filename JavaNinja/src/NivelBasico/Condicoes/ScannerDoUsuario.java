package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
            Scanner = É um jeitode trazer o usuário para a aplicação.
            Objetivo: o usuário vai criar um ninjae vamos validar os dados.
        */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do  ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Digite a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos.");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("O ninja é maior de idade");
        } else {
            System.out.println("O ninja é menor de idade");
        }

        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
