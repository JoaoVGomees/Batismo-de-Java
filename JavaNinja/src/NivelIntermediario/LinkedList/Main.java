package NivelIntermediario.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");

        System.out.println(linkedList);

        linkedList.add(1, "Kakashi Hatake");
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

    }
}
