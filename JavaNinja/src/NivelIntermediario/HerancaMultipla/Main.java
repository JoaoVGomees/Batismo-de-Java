package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        // Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 30;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();

    }
}
