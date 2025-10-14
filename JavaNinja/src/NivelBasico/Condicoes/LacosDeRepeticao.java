package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou até atingir um parâmetro desejado.
        * WHILE = FOR
        * */

        //WHILE
        //while (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 20;

//        while (numeroDeClones <= numeroMaximoDeClones) {
//            System.out.println("Quantidade de clones das sombras: " + numeroDeClones);
//            numeroDeClones++;
//        }

        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("Quantidade de clones das sombras: " + i);
        }

    }
}
