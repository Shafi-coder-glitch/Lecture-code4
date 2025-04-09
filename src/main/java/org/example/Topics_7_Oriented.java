package org.example;

public class Topics_7_Oriented {
    private String topic;
    private double length;

    // Constructor name should match class name
    public Topics_7_Oriented(String name, double length) {
        this.topic = name;
        this.length = length;
    }

    // Method to calculate distance
    public double distanceLaps(int laps) {
        return laps * length;
    }

    // Properly formatted toString
    @Override
    public String toString() {
        return topic + " pool is " + length + " meters long.";
    }
}
