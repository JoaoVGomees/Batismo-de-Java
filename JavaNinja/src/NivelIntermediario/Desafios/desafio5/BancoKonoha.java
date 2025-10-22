package NivelIntermediario.Desafios.desafio5;

public class BancoKonoha {

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.saldo >= valor) {
            origem.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transação concluída");
        } else {
            System.out.println("Saldo insuficiente para realizar a transação.");
        }
    }



}
