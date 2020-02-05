package com.capgemini.supermarket;

import com.capgemini.supermarket.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void printItems() {
        for(Product product : products) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }
}
