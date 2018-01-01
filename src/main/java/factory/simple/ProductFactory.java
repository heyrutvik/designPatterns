package factory.simple;

import factory.Product;

interface ProductFactory {

    Product create(String s) throws Exception;
}
