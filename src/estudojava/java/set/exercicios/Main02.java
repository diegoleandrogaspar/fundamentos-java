package set.exercicios;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main02 {
    public static void main(String[] args) {
        /*
        Crie uma coleção de dados de String com a interface Set, e adicione: TV, Tablet, Notebook, Computador,
        e remova todos começando com a letra T
         */

        Set<String> conjunto = new LinkedHashSet<>();

        conjunto.add("TV");
        conjunto.add("Tablet");
        conjunto.add("Notebook");
        conjunto.add("Computador");
        conjunto.add("Televisão");

        conjunto.removeIf(x -> x.charAt(0) == 'T');

        for (String p: conjunto){
            System.out.println(p);
        }
    }
}
