package NivelIntermediario.Desafios.desafio5PT2.Model;

import NivelIntermediario.Desafios.desafio5PT2.Services.Conta;
import NivelIntermediario.Desafios.desafio5PT2.Services.TipoConta;

public abstract class ContaBancaria implements Conta {

    private String nome;
    double saldo;
    private TipoConta tipoConta;

    public ContaBancaria() {}

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, double saldo, TipoConta tipoConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void consultarDados() {
        System.out.println("==== Dados da Conta ====");
        System.out.println("Nome da conta: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo na conta: " + saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo na conta de " + nome + " é de: R$" + saldo);
    }

    public abstract void depositar(double valor);
}
