package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    // Metodo da Interface
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan.");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou da Anbu");
    }
}
