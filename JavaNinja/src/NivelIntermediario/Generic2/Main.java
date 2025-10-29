package NivelIntermediario.Generic2;

public class Main {
    public static void main(String[] args) {

        BolsaGenerica<Object> bolsa = new BolsaGenerica<>();
        bolsa.adicionarItem(new Shuriken(3));
        bolsa.adicionarItem(new Kunai("Kunai Explosiva"));
        bolsa.adicionarItem(new Pergaminho("Invocação do Sapo"));

        bolsa.mostrarFerramentas();

    }
}
