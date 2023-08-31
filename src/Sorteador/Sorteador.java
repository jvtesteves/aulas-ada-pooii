package Sorteador;

import java.util.ArrayList;
import java.util.List;

public class Sorteador {


    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        if (elementos.isEmpty()) {
            return "A lista está vazia.";
        }

        int index = (int) (Math.random() * elementos.size());
        String sorteado = elementos.remove(index);
        return sorteado;
    }


    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        Sorteador sorteador = new Sorteador(elementos);
        while (!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
        }
    }
}
