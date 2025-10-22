package NivelIntermediario.Desafios.desafio5PT2.Model;

import NivelIntermediario.Desafios.desafio5PT2.Services.TipoConta;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {}

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(String nome, double saldo) {
        super(nome, saldo);
    }

    public ContaCorrente(String nome, double saldo, TipoConta tipoConta) {
        super(nome, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {

            this.setSaldo(saldo += valor);
            System.out.println("Depósito de R$" + valor + " concluído para " + getNome());
        } else {
            System.out.println("Valor inválido, tente novamente.");
        }
    }
}
