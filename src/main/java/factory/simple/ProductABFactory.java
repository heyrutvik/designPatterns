package factory.simple;

import factory.Product;
import factory.ProductA;
import factory.ProductB;

public class ProductABFactory implements ProductFactory {

    public Product create(String s) throws Exception {
        if (s.compareTo("a") == 0) {
            return new ProductA();
        } else if (s.compareTo("b") == 0) {
            return new ProductB();
        } else {
            throw new Exception("type not found");
        }
    }
}
