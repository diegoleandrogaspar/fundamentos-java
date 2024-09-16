package programacao_funcional_e_lambdas.function.util;

import programacao_funcional_e_lambdas.entities.Product;
import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
