package NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        //Atributos do Naruto ""Ficaria melhor se fosse um objeto Ninja, e sí precisasse instanciar cada novo ninja".
        String nomeNinja1 = "Naruto Uzumaki";
        short idadeNinja1 = 16;
        String nomeMissao = "Proteger a Tsunade"; // A missão poderia ser outro objeto, com nome, nivel e status.
        String nivelMissao = "C";
        String statusMissao = "Em andamento";

        // Mostrar para o usuário os Atributos do Naruto
        System.out.println("Nome do ninja 1: " + nomeNinja1);
        System.out.println("Idade do ninja 1: " + idadeNinja1);
        System.out.println("Missão Ninja 1: " + nomeMissao);
        System.out.println("Nível Missão 1: " + nivelMissao);

        // Se ele tiver 15 ou mais, todas as missões são concluídas. Mas se ele tiver menos que 15, só pode ser concluídas as missões de Nível C e D.
        if (idadeNinja1 >= 15) {
            statusMissao = "Concluída";
            System.out.println("Status da missão 1: " + statusMissao);
        } else if (idadeNinja1 < 15 && (nivelMissao.toLowerCase().equals("c") || nivelMissao.toLowerCase().equals("d"))) {
            statusMissao = "Concluída";
            System.out.println("Status da missão 1: " + statusMissao);
        } else {
            statusMissao = "Não concluída";
            System.out.println("Status da missão 1: " + statusMissao);
        }

        System.out.println(); // Pula linha para ficar mais agradável ao usuário

        // Atributos do Sasuke
        String nomeNinja2 = "Sasuke Uchiha";
        short idadeNinja2 = 13;
        String nomeMissao2 = "Encontrar Orochimaru";
        String nivelMissao2 = "C";
        String statusMissao2 = "Em andamento";

        // Mostrar para o usuário os Atributos do Sasuke
        System.out.println("Nome do ninja 2: " + nomeNinja2);
        System.out.println("Idade do ninja 2: " + idadeNinja2);
        System.out.println("Missão Ninja 2: " + nomeMissao2);
        System.out.println("Nível Missão 2: " + nivelMissao2);

        // Mesma condição para ver a idade do Ninja "Ficaria menos repetitivo se fosse uma função"
        if (idadeNinja2 >= 15) {
            statusMissao2 = "Concluída";
            System.out.println("Status da missão 2: " + statusMissao2 + ", você é maior de idade.");
        } else if (idadeNinja2 < 15 && (nivelMissao2.toLowerCase().equals("c") || nivelMissao2.toLowerCase().equals("d"))) {
            statusMissao2 = "Concluída";
            System.out.println("Status da missão 2: " + statusMissao2 + ", a missão é muito fácil");
        } else {
            statusMissao2 = "Não concluída";
            System.out.println("Status da missão 2: " + statusMissao2 + ", você é menor de idade.");
        }

        System.out.println(); // Pula linha

        // Atributos da Sakura
        String nomeNinja3 = "Sakura Haruno";
        short idadeNinja3 = 13;
        String nomeMissao3 = "Fazer comida";
        String nivelMissao3 = "D";
        String statusMissao3 = "Em andamento";

        System.out.println("Nome do ninja 3: " + nomeNinja3);
        System.out.println("Idade do ninja 3: " + idadeNinja3);
        System.out.println("Missão Ninja 3: " + nomeMissao3);
        System.out.println("Nível Missão 3: " + nivelMissao3);

        // Condição da idade
//        if (idadeNinja3 >= 15) {
//            statusMissao3 = "Concluída";
//            System.out.println("Status da missão 3: " + statusMissao3);
//        } else if (idadeNinja3 < 15 && (nivelMissao3.toLowerCase().equals("c") || nivelMissao3.toLowerCase().equals("d"))) {
//            statusMissao3 = "Concluída";
//            System.out.println("Status da missão 3: " + statusMissao3);
//        }else {
//            statusMissao3 = "Não concluída";
//            System.out.println("Status da missão 3: " + statusMissao3);
//        }
        if (idadeNinja3 < 15) {
            if (nivelMissao3.equals("C") || nivelMissao3.equals("D")) {
                statusMissao3 = "Concluída";
                System.out.println("Status da missão 3: " + statusMissao3 + ", a missão é muito fácil");
            } else {
                statusMissao3 = "Não concluída";
//              System.out.println("Status da missão 3: " + statusMissao3 + ", você é muito novo.");
            }
            System.out.println("blau");
        } else {
            statusMissao3 = "Concluída";
            System.out.println("Status da missão 3: " + statusMissao3 + ", você é maior de idade");
        }

        System.out.println();
    }
}
