package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[3] = "Hinata Hyuga";

        //String inicializam como null
        System.out.println(ninjas[4]);

        //Redeclarar
        ninjas = new String[7];
        ninjas[0] = "Hashirama Senju";
        ninjas[1] = "Tobirama Senju";
        ninjas[2] = "Hiruzen Sarutobi";
        ninjas[3] = "Minato Namikaze";
        ninjas[4] = "Tsunade Senju";
        ninjas[5] = "Kakashi Hatake";
        ninjas[6] = "Naruto Uzumaki";

        //FOR para fazer um loop no Array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninjas[i]);
        }

        // int inicializam como 0
        int[] idade = new int[2];
        System.out.println(idade[0]);

        // boolean inicializam como false
        boolean[] verdadeiroOuFalso= new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);

        // double inicializam como 0.0
        double[] flutuante = new double[2];
        System.out.println(flutuante[0]);

//        String[] ninjas = {"Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno"};
//
//        for (int i = 0; i < ninjas.length; i++) {
//            System.out.println(ninjas[i]);
//        }


//        String ninja1 = "Naruto Uzumaki";
//        String ninja2 = "Sasuke Uchiha";
//        String ninja3 = "Sakura Haruno";
//        System.out.println(ninja1);
//        System.out.println(ninja2);
//        System.out.println(ninja3);

    }
}