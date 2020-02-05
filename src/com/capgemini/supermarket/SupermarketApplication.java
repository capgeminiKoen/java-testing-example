package com.capgemini.supermarket;

import com.capgemini.supermarket.models.Product;

public class SupermarketApplication {
    public static void main(String[] args) {
        Product soap = new Product("Soap", 300);
        Product yoghourt = new Product("Yogurt", 200);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(soap);
        shoppingCart.add(soap);
        shoppingCart.add(soap);
        shoppingCart.add(yoghourt);
        shoppingCart.add(yoghourt);
        shoppingCart.add(yoghourt);
        shoppingCart.add(yoghourt);
        shoppingCart.add(yoghourt);
        shoppingCart.add(yoghourt);

        shoppingCart.printItems();

        CashRegister cashRegister = new CashRegister();
        cashRegister.checkout(shoppingCart, 5000);
    }
}
