package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 12329929);
        System.out.println("Cadastro = " + cadastro);
        System.out.println("Nome do ninja: " + cadastro.getNome());

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("João", 12329929);
        System.out.println("Cadastro usando Records = " + cadastroUsandoRecord.nome());
        /*
            NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 12329929);
            System.out.println("Cadastro usando Record = " + cadastroUsandoRecord);
            System.out.println("Email = " + cadastroUsandoRecord.emailCaixaAlta());
            System.out.println("Nome do ninjaRecord: " + cadastroUsandoRecord.nome());
        */

    }
}
