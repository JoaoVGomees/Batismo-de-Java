package NivelIntermediario.Desafios.desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {}

    public ContaCorrente(TipoConta tipoConta, double saldo) { super(tipoConta, saldo); }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor negativo. Tente novamente.");
        }

    }
}
