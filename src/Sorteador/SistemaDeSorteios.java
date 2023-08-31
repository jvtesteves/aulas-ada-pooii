package Sorteador;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {

    public static void main(String[] args) {
        List<String> elementos = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");

        Sorteador sorteador = new Sorteador(elementos);
        List<Grupo> grupos = new ArrayList<>();

        int quantidadeDeGrupos = 2; // Defina a quantidade de grupos desejada

        for (int i = 0; i < quantidadeDeGrupos; i++) {
            grupos.add(new Grupo(i + 1, new ArrayList<>()));
        }

        while (!elementos.isEmpty()) {
            for (Grupo grupo : grupos) {
                if (!elementos.isEmpty()) {
                    String elementoSorteado = sorteador.sortear();
                    grupo.adicionarNoGrupo(elementoSorteado);
                }
            }
        }

        for (Grupo grupo : grupos) {
            System.out.println(grupo);
        }
    }
}
