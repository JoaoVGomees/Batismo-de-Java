package NivelIntermediario.Desafios.desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;

    public ContaBancaria() {}

    public ContaBancaria(TipoConta tipoConta, double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }
}
