package com.capgemini.testproject.models;

public class Car {

    public int distanceToEmpty;

    public Car(int distanceToEmpty) {
        this.distanceToEmpty = distanceToEmpty;
    }

    /**
     * Drives for a distance if we have enough gas. If distance > distanceToEmpty,
     * we will not update distanceToEmpty
     * @param distance Distance we want to drive
     * @return True if we can actually travel this far, false if not
     */
    public boolean drive(int distance) {
        if(distanceToEmpty >= distance) {
            distanceToEmpty -= distance;
            return true;
        }

        // Else clause, don't need the else {} because we use return.
        return false;
    }

    /**
     * Refill the car
     * @param distanceToAdd Distance to add to the car
     */
    public void refill(int distanceToAdd) {
        distanceToEmpty += distanceToAdd;
    }
}
