package Sorteador2;

import java.util.Collection;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class SorteadorMedia<T> extends SorteadorAbstrato<T> {


    public SorteadorMedia(Collection<T> elementos) {
        super(elementos);
    }

    @Override
    protected int getIndiceSorteado() {
        return quantidadeElementos() / 2;
    }


}
