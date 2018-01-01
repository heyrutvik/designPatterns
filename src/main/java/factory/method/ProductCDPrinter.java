package factory.method;

import factory.*;

public class ProductCDPrinter extends ProductPrinter {
    public Product create(String s) throws Exception {
        if (s.compareTo("c") == 0) {
            return new ProductC();
        } else if (s.compareTo("d") == 0) {
            return new ProductD();
        } else {
            throw new Exception("type not found");
        }
    }

    public static void main(String[] args) throws Exception {
        ProductPrinter pab = new ProductCDPrinter();
        pab.print("c");
        pab.print("d");
    }
}
