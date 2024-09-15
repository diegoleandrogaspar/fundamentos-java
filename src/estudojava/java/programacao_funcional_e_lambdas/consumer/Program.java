package programacao_funcional_e_lambdas.consumer;

import programacao_funcional_e_lambdas.consumer.util.PriceUpdate;
import programacao_funcional_e_lambdas.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa que, a partir de uma lista de produtos, aumente o
         preço dos produtos em 10%.
         */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);

    }
}
