package programacao_funcional_e_lambdas.function;

import programacao_funcional_e_lambdas.entities.Product;
import programacao_funcional_e_lambdas.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /*
        Fazer um programa que, a partir de uma lista de produtos,
        gere uma nova lista contendo os nomes dos produtos em caixa alta.
         */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
