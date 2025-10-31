package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Arrays
        // São estáticos e tem referência de memória prévia, ou seja, é necessário declarar o tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Naruto 2";
        ninjasArray[2] = "Naruto 3";

        for (String ninja : ninjasArray) {
            System.out.println(ninja);
        }

        // List
        // Não são estáticos e não tem referência de memória prévia.
        // São dinâmicas, e o tamanho aumenta e diminui quando precisa.
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Sasuke");

        System.out.println(ninjasList);

        // Stack
        // O último elemento a entrar, é o primeiro a sair. Como se fosse uma pilha de livros, o ultimo livro colocado sempre vai ser o primeiro.
        // Uma forma de visualizar isso é como se fosse uma List ao contrário, conforme vc coloca, o primeiro colocado sempre vai ficando por último.
        Stack<String> ninjasStack = new Stack<>();

        // Push: Coloca um elemento na pilha
        ninjasStack.push("Primeiro elemento colocado - Linha 25");
        ninjasStack.push("Segundo elemento colocado - Linha 26");
        ninjasStack.push("Terceiro elemento colocado - Linha 27");
        System.out.println(ninjasStack);

        // Pop: Tira um elemento da pilha.
        // Nessa ocasião, vai tirar o = "Terceiro elemento colocado - Linha 27"
        ninjasStack.pop();
        System.out.println(ninjasStack);

        // Peek: Verifica qual o próximo elemento da lista
        // Nessa ocasião, iria retornar o = "Segundo elemento colocado - Linha 26"
        System.out.println(ninjasStack.peek());

        // Size: Precisa nem de explicação ne, retorna o tamanho da Stack
        System.out.println(ninjasStack.size());


    }
}
