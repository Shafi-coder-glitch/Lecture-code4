package org.example;

public class SwimmingpoolProgram {
    public static void main(String[] args) {
        Topics_7_Oriented ymca = new Topics_7_Oriented("YMCA", 50);

        double totalSwam = ymca.distanceLaps(6);
        System.out.println("Total Swam: " + totalSwam + " meters");
    }
}
