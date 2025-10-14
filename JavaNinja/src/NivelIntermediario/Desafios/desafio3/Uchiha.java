package NivelIntermediario.Desafios.desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nível da dificuldade da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        System.out.println("Habilidade especial do Uchiha: " + habilidadeEspecial);
        System.out.println("");
    }

}
