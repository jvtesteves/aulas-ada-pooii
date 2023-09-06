package Sorteador2;


import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class SistemaDeSorteios {

    public static void main(String[] args) {
        List<String> elementos  = List.of(
                "banana", "maçã", "abacate", "tomate",
                "ameixa", "melancia", "fruta do conde", "mirtilo" );
        Sorteador<String> stringSorteador = new SorteadorPrimeiro<>(elementos);
        Agrupador<String> agrupador = new Agrupador<>(stringSorteador);
        List<Grupo<String>> grupos = agrupador.agrupar(3);
        System.out.println(grupos);

        Set<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(22);
        inteiros.add(22);
        inteiros.add(22);
        inteiros.add(22);
        inteiros.add(45567);
        inteiros.add(777);
        inteiros.add(222);
        inteiros.add(77909);
        inteiros.add(1235);
        inteiros.add(42);
        Sorteador<Integer> integerSorteador = new SorteadorMedia<>(inteiros);
        Agrupador<Integer> agrupadorDeInteiros = new Agrupador<>(integerSorteador);
        List<Grupo<Integer>> gruposDeInteiros = agrupadorDeInteiros.agrupar(4);
        System.out.println(gruposDeInteiros);


    }
}
