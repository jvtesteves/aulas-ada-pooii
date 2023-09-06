package Sorteador2;

import java.util.ArrayList;
import java.util.List;

public class Grupo<E> {

    private final List<E> elementosDoGrupo;
    private final int indice;

    public Grupo(int indice) {
        this.indice = indice;
        this.elementosDoGrupo = new ArrayList<>();
    }

    public void adicionarNoGrupo(E novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "Grupo " + indice +
                "{ elementosDoGrupo=" + elementosDoGrupo +
                '}';
    }
}
