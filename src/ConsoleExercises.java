import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %2f", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert an integer");
        int userInput = scanner.nextInt();
        System.out.println("The number you entered is " +  userInput);
    }

}
