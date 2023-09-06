package Sorteador2;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class SorteadorPrimeiro<T> extends SorteadorAbstrato<T> {

    public SorteadorPrimeiro(Collection<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return 0;
    }


}