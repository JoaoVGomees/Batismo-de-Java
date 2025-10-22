package NivelIntermediario.Desafios.desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {}

    public ContaPoupanca(TipoConta tipoConta, double saldo) { super(tipoConta, saldo); }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor - (valor * 0.01);
        } else {
            System.out.println("Valor negativo. Tente novamente.");
        }
    }
}
