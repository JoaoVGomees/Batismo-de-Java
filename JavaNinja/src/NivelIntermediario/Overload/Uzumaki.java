package NivelIntermediario.Overload;

public class Uzumaki extends Ninja {

    public Uzumaki() {}

    public Uzumaki(String nome, String aldeia, int idade) { super(nome, aldeia, idade); }

    public Uzumaki(String nome, String aldeia, int idade, int numeroMissoesConluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroMissoesConluidas, rank);
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar");
    }
}
