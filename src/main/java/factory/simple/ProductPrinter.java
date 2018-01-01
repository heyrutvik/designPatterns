package factory.simple;

import factory.Product;
public class ProductPrinter {

    ProductFactory factory = null;

    public ProductPrinter(ProductFactory pf, String type) throws Exception {
        factory = pf;
        Product p = factory.create(type);
        p.print();
    }

    public static void main(String[] args) throws Exception {
        ProductFactory pd1 = new ProductABFactory();
        ProductPrinter p1 = new ProductPrinter(pd1, "a");
        ProductPrinter p2 = new ProductPrinter(pd1, "b");
        ProductFactory pd2 = new ProductCDFactory();
        ProductPrinter p3 = new ProductPrinter(pd2, "c");
        ProductPrinter p4 = new ProductPrinter(pd2, "d");
    }
}
