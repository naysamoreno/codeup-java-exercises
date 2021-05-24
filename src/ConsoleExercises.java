import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %2f", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please insert an integer ");
        int userInput = scanner.nextInt();
        System.out.println("The number you entered is " +  userInput);
        System.out.println("\n please enter three words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("you said the following three words... \n first: " + firstWord + "\n second: " + secondWord + "\n third: " + thirdWord );


    }

}
