package NivelIntermediario.Overload;

public abstract class Ninja implements EstrategiaDeBatalha{

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank;
    //TODO: Rank: Genin, Chuunin, Jounin, Kage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor, chamando os novos atributos
    //Sobrecarga de métodos você não precisa redeclarar o construtor, apenas os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }

    // Inteligência de Combate - metodo padrão
    public void inteligenciaDeCombate() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha inteligência de combate");
    }

    // Inteligência de Combate - Sobrecarga de metodo
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é de " + qi + ", e você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é de " + qi + ", e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é de " + qi + ", e você precisa treinar mais suas estratégias!");
        }

    }
}
