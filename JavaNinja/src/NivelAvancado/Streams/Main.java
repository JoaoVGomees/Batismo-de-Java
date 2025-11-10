package NivelAvancado.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 18));
        ninjas.add(new Ninja("Temari", "Suna", 19));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));


        // Filtragem dos ninjas por vila
        ninjas.stream()
            .filter(ninja -> ninja.getVila().equalsIgnoreCase("Konoha"))
            .forEach(System.out::println); //soutc

        System.out.println("=======================================================");

        // Ordenação
        ninjas.stream()
            .sorted((n1, n2) -> CharSequence.compare(n1.getNome(), n2.getNome()))
            .forEach(System.out::println);
    }
}
