package NivelBasico.TipoDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        Dados Primitivos - int, double, float, char, boolean, short
        Objetivo da aula: Criar um Ninja - Naruto
        */

        int idade = 16; // Valor máximo: 2.147.483.647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; // Valor máximo: 9.223.372.036.854.775.807

        System.out.println(idade); // Comando para mostrar para o usuário - Atalho sout
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é " + idade);
    }
}