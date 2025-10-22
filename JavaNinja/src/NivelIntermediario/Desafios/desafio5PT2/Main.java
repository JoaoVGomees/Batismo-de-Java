package NivelIntermediario.Desafios.desafio5PT2;

import NivelIntermediario.Desafios.desafio5PT2.Services.BancoKonoha;
import NivelIntermediario.Desafios.desafio5PT2.Services.TipoConta;
import NivelIntermediario.Desafios.desafio5PT2.Model.ContaCorrente;
import NivelIntermediario.Desafios.desafio5PT2.Model.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner xaxa = new Scanner(System.in);

        BancoKonoha banco = new BancoKonoha();

        ContaCorrente contaCorrente = new ContaCorrente("Conta 1", 1500, TipoConta.CORRENTE);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Conta 2", 1500, TipoConta.POUPANCA);

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("==== Banco de Konoha ====");
            System.out.println("1. Consultar dados da conta.");
            System.out.println("2. Consultar saldo da conta.");
            System.out.println("3. Depositar valor.");
            System.out.println("4. Fazer transação.");
            System.out.println("5. Sair.");
            opcao = xaxa.nextInt();
            xaxa.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a conta: 1 ou 2");
                    int resposta = xaxa.nextInt();
                    xaxa.nextLine();

                    if (resposta == 1) {
                        contaCorrente.consultarDados();
                    } else if (resposta == 2) {
                        contaPoupanca.consultarDados();
                    } else {
                        System.out.println("Conta inválida");
                    }
                    break;
                case 2:
                    System.out.println("Digite a conta: 1 ou 2");
                    int conta = xaxa.nextInt();
                    xaxa.nextLine();

                    if (conta == 1) {
                        contaCorrente.consultarSaldo();
                    } else if (conta == 2) {
                        contaPoupanca.consultarSaldo();
                    } else {
                        System.out.println("Conta inválida");
                    }
                    break;
                case 3:
                    System.out.println("Digite a conta: 1 ou 2");
                    int deposito = xaxa.nextInt();
                    xaxa.nextLine();

                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = xaxa.nextDouble();
                    xaxa.nextLine();

                    if (deposito == 1) {
                        contaCorrente.depositar(valor);
                    } else if (deposito == 2) {
                        contaPoupanca.depositar(valor);
                    } else {
                        System.out.println("Conta inválida");
                    }
                    break;
                case 4:
                    System.out.println("Digite sua conta: 1 ou 2");
                    int transacao = xaxa.nextInt();
                    xaxa.nextLine();

                    System.out.println("Digite o valor a ser depositado: ");
                    double valorTransacao = xaxa.nextDouble();
                    xaxa.nextLine();

                    System.out.println("Deseja escrever uma descrição para a transação? S/N");
                    String respDescricao = xaxa.nextLine();

                    if (respDescricao.equalsIgnoreCase("S")) {
                        System.out.println("Digite a descrição: ");
                        String descricao = xaxa.nextLine();

                        if (transacao == 1) {
                            banco.transferir(contaCorrente, contaPoupanca, valorTransacao, descricao);
                        } else if (transacao == 2) {
                            banco.transferir(contaPoupanca, contaCorrente, valorTransacao, descricao);
                        } else {
                            System.out.println("Conta inválida");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Resposta inválida, tente novamente.");
                    break;
            }


        }
    }
}
