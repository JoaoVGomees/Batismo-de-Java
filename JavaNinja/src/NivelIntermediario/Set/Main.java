package NivelIntermediario.Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Lista normal, que tem ordem e os dados podem ser repetidos
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Sakura Haruno");

        System.out.println("======== Array List ========");
        System.out.println(ninjas);

        // Lista baseada em chave e valor, que tem ordem e os dados podem ser repetidos também
        LinkedList<String> ninjasLinkedList = new LinkedList<>();
        ninjasLinkedList.addAll(ninjas);

        System.out.println("======== Linked List ========");
        System.out.println(ninjasLinkedList);

        // Lista que só contém os dados, não tem ordem , mas não é possível colocar elementos repetidos.
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println("======== Hash Set ========");
        System.out.println(ninjasSet);

        // Lista igual ao Set de cima, não é possível colocar os dados duplicados, mas faz uma ordem automática,
        // Exemplo: se for um Set só de String, irá ordenar em ordem alfabética
        // Se for um Set de Integer, irá ordenar normalmente, tipo, 0 1 2 3 4. Ou até 100 102 421 912 1023
        Set<String> ninjasTreeSetList = new TreeSet<>();
        ninjasTreeSetList.addAll(ninjas);

        System.out.println("======== Tree Set ========");
        System.out.println(ninjasTreeSetList);

        // Lista igual ao HashSet, não pode ter elementos duplicados, mas faz uma ordem de injeção, igual o ArrayList
        // Ou o LinkedList. Ex: vai ser de acordo com os dados colocados.
        // Se eu coloco o Sasuke, Naruto e o Zabuza. Vai mostrar exatamente nessa ordem.
        // Enquanto o TreeSet mostraria em ordem alfabética. [Naruto, Sasuke, Zabuza]
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjas);

        System.out.println("======== Linked Hash Set ========");
        System.out.println(ninjasLinkedHashSet);
    }
}
