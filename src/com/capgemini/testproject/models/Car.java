package com.capgemini.testproject.models;

public class Car {

    public int distanceToEmpty;
    private final int maximumDistance;

    public Car(int distanceToEmpty, int maximumDistance) {
        this.distanceToEmpty = distanceToEmpty;
        this.maximumDistance = maximumDistance;
    }

    /**
     * Drives for a distance if we have enough gas. If distance > distanceToEmpty,
     * we will not update distanceToEmpty
     * @param distance Distance we want to drive
     * @return True if we can actually travel this far, false if not
     */
    public void drive(int distance) throws CarDoesNotHaveEnoughGasException {
        if(distanceToEmpty >= distance) {
            distanceToEmpty -= distance;
        }

        // Else clause, don't need the else {} because we use return.
        throw new CarDoesNotHaveEnoughGasException();
    }

    /**
     * Refill the car
     * @param distanceToAdd Distance to add to the car
     */
    public void refill(int distanceToAdd) {
        if(distanceToAdd < 0) {
            // Replace this!
            // throw new InvalidInputException();
        }
        if(distanceToEmpty + distanceToAdd > maximumDistance) {
            // Replace this!
            // throw new InvalidInputException
        }
        distanceToEmpty += distanceToAdd;
    }
}
