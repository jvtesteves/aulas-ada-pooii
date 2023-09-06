package Sorteador2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public abstract class SorteadorAbstrato<T> implements Sorteador<T> {

    private final List<T> elementos;

    public SorteadorAbstrato(Collection<T> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    public RecordPair<T, Integer> sortear() {
        if (elementos.isEmpty()) {
            return null;
        }

        int indiceSorteado = getIndiceSorteado();
        T elementoSorteado = elementos.remove(indiceSorteado);
        return new RecordPair<>(elementoSorteado, indiceSorteado);

    }

    protected abstract int getIndiceSorteado();


    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }

    protected int quantidadeElementos() {
        return elementos.size();
    }

}
