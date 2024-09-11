package map;

import map.entities.Produto;

import java.util.HashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        /*
        Crie um Map de Produto e valor
         */

        Map<Produto,Double> produtos = new HashMap<>();

        Produto p1 = new Produto("Tv", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        produtos.put(p1, 10000.0);
        produtos.put(p2, 20000.0);
        produtos.put(p3, 15000.0);

        Produto ps = new Produto("Tv", 900.0);

        System.out.println("Contém 'ps' chave: " + produtos.containsKey(ps));
    }
}