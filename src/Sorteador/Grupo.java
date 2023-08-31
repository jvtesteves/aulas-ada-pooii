package Sorteador;

import java.util.List;

public class Grupo {

    private final List<String> elementosDoGrupo;
    private final int indice;

    public Grupo(int indice, List<String> elementosDoGrupo) {
        this.indice = indice;
        this.elementosDoGrupo = elementosDoGrupo;
    }

    public void adicionarNoGrupo(String novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "Grupo " + indice +
                "{ elementosDoGrupo=" + elementosDoGrupo +
                '}';
    }
}
