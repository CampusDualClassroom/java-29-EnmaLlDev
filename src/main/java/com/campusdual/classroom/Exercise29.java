package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            System.out.println("Instantiating the class...");
            Thread.sleep(1000);
            System.out.println("After thread!");
        } catch (Exception e) {
            // Catch any exception that occurs during instantiation
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
