package NivelIntermediario.Desafios.desafio4;

public class NinjaBasico implements Ninja {

    TipoHabilidade habilidade;

    public NinjaBasico(TipoHabilidade habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Mostrando informações do Ninja Básico");
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade Ninja básico: " + habilidade);
    }
}
