package Sorteador2;


import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class SorteadorUltimo<T> extends SorteadorAbstrato<T> {


    public SorteadorUltimo(Collection<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return quantidadeElementos() - 1;
    }


}
