package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

//        NoArgsConstructor: Construtor sem argumentos.
//        Hokage Hashirama = new Hokage();
//        Hashirama.nome = "Hashirama Senju";
//        Hashirama.idade = 35;
//        Hashirama.vivoOuNao = false;

//        AllArgsConstructor: Construtor com todos os argumentos.
        Hokage Hashirama = new Hokage("Hashirama Senju", 35, false);
        System.out.println("Nome: " + Hashirama.nome + "; Idade: " + Hashirama.idade);
    }
}
