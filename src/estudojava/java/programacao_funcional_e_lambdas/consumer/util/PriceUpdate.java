package programacao_funcional_e_lambdas.consumer.util;

import programacao_funcional_e_lambdas.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
