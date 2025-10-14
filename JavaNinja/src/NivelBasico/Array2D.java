package NivelBasico;

public class Array2D {
    public static void main(String[] args) {
//        String[] ninjas = new String[3];
//        ninjas[0] = "Naruto Uzumaki";
//        ninjas[1] = "Sasuke Uchiha";
//        ninjas[2] = "Sakura Haruno";
//
//        for (int i = 0; i < ninjas.length; i++) {
//            System.out.println(ninjas[i]);
//        }

        String[][] ninjasEAldeia = new String[3][3];
        ninjasEAldeia[0][0] = "Konoha";
        ninjasEAldeia[0][1] = "Naruto Uzumaki";
        ninjasEAldeia[0][2] = "Sasuke Uchiha";

        ninjasEAldeia[1][0] = "Névoa";
        ninjasEAldeia[1][1] = "Zabuza";
        ninjasEAldeia[1][2] = "Haku";

        ninjasEAldeia[2][0] = "Deserto";
        ninjasEAldeia[2][1] = "Gaara";
        ninjasEAldeia[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeia.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeia[i][0] + " - Ninja 1: " + ninjasEAldeia[i][1] + " - Ninja 2: " + ninjasEAldeia[i][2]);
        }
    }
}
