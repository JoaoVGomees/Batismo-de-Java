package NivelIntermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        String[] ninjasArray = new String[6];

        // List
        List<String> ninjasList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // QUEUE / Filas
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru"); // Por enquanto é o Tail

        // Mostrar a QUEUE / Fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Remover a Head da fila || Remover o primeiro ninja da fila, como se fosse ninjasQueue[0] = null tlgd
        ninjasQueue.poll();

        // Vai mostrar a lista sem o Head, sem o Naruto.
        System.out.println("Ninjas na fila depois do pool(): " + ninjasQueue);

        // Como ver quem é o Head, primeiro da fila. Que é o Sasuke, ja que o Naruto foi removido com o .pool()
        System.out.println("Primeiro da fila / Head: " + ninjasQueue.peek());

        // Adicionar a fila, adiciona normalmente no final.
        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama"); // Agora o Tobirama é o tail no lugar do Shikamaru

        // Como remover o Tail(Tobirama), que é e sempre será o último da fila.
        // NÃO TEM COMO, é pau filho.

        // Verificar se a QUEUE está vazia
        System.out.println("A QUEUE está vazia? " + ninjasQueue.isEmpty());

        // Ou faz um if pra ficar mais visível
        if(ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Tem ninja na fila");
        }


    }
}
