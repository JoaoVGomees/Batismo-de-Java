package NivelIntermediario.Desafios.desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado(String especialidade, String nome, int idade, TipoHabilidade habilidade) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Usando Habilidade especial: " + habilidade);
    }
}
