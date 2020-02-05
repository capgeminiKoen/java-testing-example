package com.capgemini.supermarket;

import com.capgemini.supermarket.models.Product;

public class CashRegister {
    public void checkout(ShoppingCart shoppingCart, int money) {

        int total = 0;
        int discount = 0;

        // sum all prices
        for(Product product: shoppingCart.getProducts()) {
            total += product.getPrice();
        }

        if(total >= 2000) {
            discount = 100;
        }
        else if(total >= 1000) {
            discount = 50;
        }

        int priceToPay = total - discount;

        // Display items?
        System.out.println("Welcome to the checkout.");
        System.out.println("You ordered the following items:");

        shoppingCart.printItems();

        // Display total amount of money
        System.out.println("The total is: " + total);
        System.out.println("The discount is: " + discount);
        System.out.println();
        System.out.println("You have to pay: " + priceToPay);

        System.out.println();
        System.out.println("You paid " + money);

        System.out.println();
        System.out.println("Your change is " + (money - priceToPay));
    }
}
