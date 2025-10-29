package NivelIntermediario.Generic;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsa = new BolsaGenerica<>();
        bolsa.adicionarEquipamentos(kunai);
        bolsa.adicionarEquipamentos(shuriken);
        bolsa.adicionarEquipamentos(pergaminho);

        System.out.println(bolsa);

    }
}
