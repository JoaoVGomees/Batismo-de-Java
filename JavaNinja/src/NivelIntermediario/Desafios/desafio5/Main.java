package NivelIntermediario.Desafios.desafio5;

public class Main {
    public static void main(String[] args) {

        BancoKonoha banco = new BancoKonoha();

        ContaCorrente contaCorrente = new ContaCorrente(TipoConta.CONTACORRENTE, 1500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(TipoConta.CONTACORRENTE, 1500);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

        contaCorrente.depositar(100);
        contaPoupanca.depositar(100);

        banco.transferir(contaCorrente, contaPoupanca, 100);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();


    }
}
