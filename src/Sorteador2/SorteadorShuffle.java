package Sorteador2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SorteadorShuffle<T> implements Sorteador<T> {

    private final List<T> elementos;
    public SorteadorShuffle(List<T> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }

    @Override
    public RecordPair<T, Integer> sortear() {
        if (elementos.isEmpty()) {
            return null;
        }

        Collections.shuffle(elementos);
        T elementoSorteado = elementos.remove(0);
        return new RecordPair<>(elementoSorteado, 0);
    }

    @Override
    public boolean possuiElementos() {
        return !elementos.isEmpty();
    }


}