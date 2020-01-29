package com.capgemini.testproject.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void driveReturnsTrueOnSuccess() {
        // Setup
        Car car = new Car(100);

        // Act
        boolean result = car.drive(40);

        // Assert
        assertTrue(result);
        assertEquals(60, car.distanceToEmpty);
    }

    @Test
    public void driveReturnsFalseOnFailure() {
        // Setup
        Car car = new Car(100);

        // Act
        boolean result = car.drive(140);

        // Assert
        assertFalse(result);
        assertEquals(100, car.distanceToEmpty);
    }

    @Test
    public void refill() {
        // Setup
        Car car = new Car(100);

        // Act
        // call refill function...

        // Assert
        // ...

    }
}