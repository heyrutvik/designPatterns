package factory.simple;

import factory.*;

public class ProductCDFactory implements ProductFactory {

    public Product create(String s) throws Exception {
        if (s.compareTo("c") == 0) {
            return new ProductC();
        } else if (s.compareTo("d") == 0) {
            return new ProductD();
        } else {
            throw new Exception("type not found");
        }
    }
}
