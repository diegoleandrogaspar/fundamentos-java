package programacao_funcional_e_lambdas.function;

import programacao_funcional_e_lambdas.entities.Product;
import programacao_funcional_e_lambdas.function.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program02 {
    public static void main(String[] args) {
        /*
        Fazer um programa que, a partir de uma lista de produtos,
        calcule a soma dos preços somente dos produtos cujo nome começa com "T".
         */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD case", 80.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
