package Sorteador2;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class SorteadorQuebrado<T> extends SorteadorAbstrato<T> {

    private final List<T> elementos;
    public SorteadorQuebrado(List<T> elementos) {
        super(elementos);
        this.elementos = elementos;
    }

    @Override
    protected int getIndiceSorteado() {
        return -1;
    }


    @Override
    public RecordPair<T, Integer> sortear() {
        if (elementos.isEmpty()) {
            return null;
        }

        int indiceSorteado = ThreadLocalRandom.current().nextInt(0, quantidadeElementos());
        T elementoSorteado = elementos.get(indiceSorteado);
        return new RecordPair<>(elementoSorteado, indiceSorteado);
    }


}
