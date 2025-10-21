package NivelIntermediario.Overload;

import NivelIntermediario.Overload.Ninja;
import NivelIntermediario.Overload.Uchiha;
import NivelIntermediario.Overload.Uzumaki;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 20, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27 );
        itachi.habilidadeEspecial();

        // Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        // Metodo Comum
        madara.inteligenciaDeCombate();
        // Metodo Sobrecarregado
        madara.inteligenciaDeCombate(150);

    }
}
