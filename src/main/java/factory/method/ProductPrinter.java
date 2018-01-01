package factory.method;

import factory.Product;

abstract public class ProductPrinter {

    Product p = null;

    public void print(String type) throws Exception {
        p = create(type);
        p.print();
    }

    abstract Product create(String type) throws Exception;
}