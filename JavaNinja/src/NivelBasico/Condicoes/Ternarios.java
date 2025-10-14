package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternários: São maneiras de reduzir o código
        * */

        String positivo = "Esse ninja está com mais de 10 missões";
        String negativo = "Esse ninja está com menos de 10 missões";

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? positivo : negativo;

        System.out.println(nivelDoNinja);



    }
}
