package NivelIntermediario.Desafios.desafio3PT3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
