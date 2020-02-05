package com.capgemini.valueversusreference;

import com.sun.jna.Native;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();

        changeSomething(car);

        System.out.println("x: " + car.x);
    }

    private static void changeSomething(Car car) {
        car.x = 500;
    }
}
