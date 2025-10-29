package NivelIntermediario.Generic;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        equipamentos = new ArrayList<>();
    }

    // Colocar equipamentos genéricos
    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Equipamentos: " + equipamentos.toString();
    }
}
