package NivelIntermediario.Desafios.desafio5PT2.Services;

import NivelIntermediario.Desafios.desafio5PT2.Model.ContaBancaria;

public class BancoKonoha {

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (valor > 0 && origem.getSaldo() >= valor) {
            double saldo = origem.getSaldo();

            origem.setSaldo(saldo -= valor);
            destino.setSaldo(destino.getSaldo() + valor);

            System.out.println("Valor de R$" + valor + " transferido com sucesso para a conta " + destino.getNome());
        }
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor, String descricao) {
        transferir(origem, destino, valor);
        System.out.println("Descrição da transação: " + descricao);
    }

}
