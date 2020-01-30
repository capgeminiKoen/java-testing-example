package com.capgemini.testproject;

import com.capgemini.testproject.models.Car;
import com.capgemini.testproject.models.CarDoesNotHaveEnoughGasException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car = new Car(200, 500);
        try {
            car.drive(400);
            car.refill(600);
        }
        catch (CarDoesNotHaveEnoughGasException e) {
            System.out.println("We can't drive that far :'(");
        }
    }
}
