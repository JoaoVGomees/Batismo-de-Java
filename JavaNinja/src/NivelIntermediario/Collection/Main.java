package NivelIntermediario.Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ArrayList, LinkedList, Stack:
        // São classes que implementam a interface List, que implementa a interface Collection
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        // O Queue é uma interface que implementa a interface Collection
        Queue<String> queue = new LinkedList<>();

        // A PriorityQueue é uma classe que implementa a interface Queue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();


    }
}
