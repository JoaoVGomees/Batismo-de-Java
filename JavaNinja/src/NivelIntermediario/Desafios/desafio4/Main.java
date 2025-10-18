package NivelIntermediario.Desafios.desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico(TipoHabilidade.GENJUTSU);
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.usarHabilidade();

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Rasengan", "Naruto", 17, TipoHabilidade.TAIJUTSU);
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.usarHabilidade();
    }
}
