package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("give me a string");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = this.scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("that number is invalid");
            return getInt(min, max);
        }
    }

    public int getInt(int num) {
        return num;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double userInput = this.scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getDouble(min, max);
        }
    }

    public double getDouble() {
        System.out.println("double down let me see it");
        double userInput = this.scanner.nextDouble();
        return userInput;
    }


    public static void main(String[] args) {
        Input in = new Input();
        System.out.println(in.getString());
    }
}
