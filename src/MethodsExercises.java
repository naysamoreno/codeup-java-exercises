import java.util.Scanner;

public class MethodsExercises {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        return num1/num2;
    }
    public static int modulo(int num1, int num2) {
        return num1%num2;
    }
    public static int getInt(int min, int max) {
        System.out.printf("enter a number between %d and %d", min, max);
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            input = sc.nextInt();
            if (input < min || input > max) {
                System.out.println("Input invalid");
            }
        } while (input < min || input > max);
        System.out.println("Input acceptable");
        return input;
    }
        public static String factorial(long num) {
            long factorial = 1L;
            String result = " = ";
            for (long i = 1L; i <=num; i++) {
                factorial *= i;
                if (i == num) {
                    result += i;
                } else {
                    result += i + " x ";
                }
            }
            return factorial + result;
        }
    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }
    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides is the die?");
            int sides = sc.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = sc.nextInt();
            diceRoll(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                keepGoing = false;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(subtract(5, 4));
        System.out.println(multiply(9, 50));
        System.out.println(divide(50, 2));
        System.out.println(modulo(9,3));

    }
}
