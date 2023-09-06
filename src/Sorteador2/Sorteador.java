package Sorteador2;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
/*
 * Refatorar a classe sorteador para que seja genérica
 */
public interface Sorteador<T> {

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    RecordPair<T, Integer> sortear() ;

    boolean possuiElementos();

}
