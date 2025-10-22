package NivelIntermediario.Desafios.desafio5PT2.Model;

import NivelIntermediario.Desafios.desafio5PT2.Services.TipoConta;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {}

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
    }

    public ContaPoupanca(String nome, double saldo, TipoConta tipoConta) {
        super(nome, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor - (valor * 0.01);
            System.out.println("Depósito de R$" + valor + " concluído para " + getNome() + ". Com uma taxa de 1%.");
        } else {
            System.out.println("Valor inválido, tente novamente.");
        }
    }

}
