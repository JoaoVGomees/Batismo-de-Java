package NivelBasico.TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
            Dados não Primitivos: String, Array, Class, ENUM.
            Objetivo: Criar um ninja, e atribuir métodos a ele.
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOCK.
        System.out.println("Esse nome está em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse nome está normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeiaLowerCase);
        System.out.println(aldeia);

    }
}