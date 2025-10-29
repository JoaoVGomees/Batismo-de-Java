package NivelIntermediario.Generic2;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    List<T> itens;

    public BolsaGenerica() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void mostrarFerramentas() {
        for (T ferramenta : itens) {
            System.out.println(ferramenta.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipamentos: " + itens.toString();
    }
}
