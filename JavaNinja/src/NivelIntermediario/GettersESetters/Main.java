package NivelIntermediario.GettersESetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------- Naruto Uzumaki ----------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Konoha", 17, 30, 1.75);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome());

        System.out.println("---------------- Sasuke Uchiha ----------------");
        Uchiha sasuke = new Uchiha("Sasuke", "Konoha", 17, 29, 1.74);

    }
}
