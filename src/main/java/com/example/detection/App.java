package com.example.detection;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double stopLine = 100.0; // Stop line position in meters

        System.out.println("Enter the signal color (red / yellow / green):");
        String signal = s.nextLine().trim().toLowerCase();

        System.out.println("Enter your vehicle position (in meters):");
        double vehiclePosition = s.nextDouble();

        boolean violation = false;

        switch (signal) {
            case "red":
                if (vehiclePosition > stopLine) {
                    violation = true;
                }   break;
            case "yellow":
                if (vehiclePosition > stopLine) {
                    violation = true;
                }   break;
            case "green":
                violation = false;
                break;
            default:
                System.out.println("Invalid signal color entered.");
                s.close();
                return;
        }

        if (violation) {
            System.out.println("Violation detected! Please stop at the signal.");
        } else {
            System.out.println("No violation. Drive safely!");
        }

        s.close();
    }
}