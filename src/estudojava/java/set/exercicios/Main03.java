package set.exercicios;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main03 {
    public static void main(String[] args) {
        /*
        inserir dois conjuntos de números inteiros. O programa deve unir esses dois conjuntos
        (ou seja, combinar os elementos sem duplicatas) e exibir o conjunto resultante.
         */

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //uniao
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // interseção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
