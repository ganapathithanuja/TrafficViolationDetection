import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stopLine = 100.0; // Stop line position in meters

        System.out.println("Enter the signal color (red / yellow / green):");
        String signal = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter your vehicle position (in meters):");
        double vehiclePosition = scanner.nextDouble();

        boolean violation = false;

        if (signal.equals("red")) {
            if (vehiclePosition > stopLine) {
                violation = true;
            }
        } else if (signal.equals("yellow")) {
            if (vehiclePosition > stopLine) {
                violation = true;
            }
        } else if (signal.equals("green")) {
            violation = false;
        } else {
            System.out.println("Invalid signal color entered.");
            scanner.close();
            return;
        }

        if (violation) {
            System.out.println("Violation detected! Please stop at the signal.");
        } else {
            System.out.println("No violation. Drive safely!");
        }

        scanner.close();
    }
}

