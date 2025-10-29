package NivelIntermediario.List;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos, não alteram de tamanho.
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura Haruno";
        System.out.println("Printando Array: " + ninjasArray[0]);

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Ninja: " + ninjasArray[i]);
        }

        // Listas
        // Não são estáticas, elas podem aumentar e diminuir de tamanho
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");

        // Adicionar item na lista
        ninjasList.add("saguadin");
        System.out.println("Ninjas List: " + ninjasList);

        // Remover item da lista
        ninjasList.remove("saguadin");
        System.out.println("Ninjas List: " + ninjasList);

        // Trocar/Atualizar item da lista
        ninjasList.set(2, "Hinata Hyuga");
        System.out.println("Ninjas List: " + ninjasList);

        // Ver o tamanho da lista
        System.out.println("Tamanho da lista: " + ninjasList.size());
    }
}
