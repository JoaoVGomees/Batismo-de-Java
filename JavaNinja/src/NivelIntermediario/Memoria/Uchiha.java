package NivelIntermediario.Memoria;

public class Uchiha extends Ninja {

    public Uchiha() { super(); }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroMissoesConluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroMissoesConluidas, rank);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes." );
    }

    @Override
    public void inteligenciaDeCombate () {
        System.out.println( "Meu nome é: " + nome + " Essa é minha inteligência de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é de " + qi + ", e você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é de " + qi + ", e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é de " + qi + ", e você precisa treinar mais suas estratégias!");
        }

    }

    // Colocar o @Override é uma convenção Java
    // E quando existe um erro de digitação, o @Override da erro e fala que não existe a classe errada no Pai.
    public void metodoProvisorio() {
        System.out.println("Teste na classe Uchiha!");
    }
}
