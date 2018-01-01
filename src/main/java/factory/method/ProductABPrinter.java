package factory.method;

import factory.Product;
import factory.ProductA;
import factory.ProductB;

public class ProductABPrinter extends ProductPrinter {
    public Product create(String s) throws Exception {
        if (s.compareTo("a") == 0) {
            return new ProductA();
        } else if (s.compareTo("b") == 0) {
            return new ProductB();
        } else {
            throw new Exception("type not found");
        }
    }

    public static void main(String[] args) throws Exception {
        ProductPrinter pab = new ProductABPrinter();
        pab.print("a");
        pab.print("b");
    }
}
