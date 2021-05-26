import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        long i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//
//        } while (i < 1000000);

//        for (int x =100; x >= -10; x--) {
//            System.out.println(x);
//            x-=5;
//        }
//        for (long i =2; i < 1000000; i++) {
//            System.out.println(i);
//            i*=i;
//        }
            /*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
program Starts:
Please enter pin:
22132
Output:
Incorrect, try again.
Please enter pin:
23412
Output:
Incorrect, try again.
Please enter pin:
12345
Output:
Correct, welcome back.
 */
        Scanner scanner = new Scanner(System.in);
//        int pinNumber = 12345;
//
//        for (int p =1; p <=3; p++) {
//            System.out.println("please enter your access pin");
//            int attempt = scanner.nextInt();
//            if (attempt != pinNumber) {
//                System.out.println("Incorrect, try again");
//            } else if (attempt == pinNumber) {
//                System.out.println("Correct, Welcome Back");
//                break;
//            } else if (p == 3 && attempt != pinNumber) {
//                System.out.println("Sorry but you have been locked out");
//            }
//        }
        //#3
//        int i = 0;
//        int userInput2 = 0;
//        do {
//            System.out.println("Please enter an integer");
//            int userInput = scanner.nextInt();
//            System.out.println("");
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (i = 1; i <= userInput; i++)
//                System.out.println("" + i + "\t  |\t" + Math.pow(i, 2) + "\t |\t" + (Math.pow(i, 3)));
//            System.out.println("would you like to conitinue? 0 for no // 1 for yes ");
//            userInput2 = scanner.nextInt();
//            if (userInput2 == 1) {
//
//            };
//        } while (userInput2 != 0);
//        System.out.println("thank you for playing");
        // #4

        String userChoice = "";
        do {
            System.out.println("Hi please enter your final grade from 0-100");
            int finalGrade = scanner.nextInt();
            if (finalGrade >= 88 && finalGrade <= 100) {
                System.out.println("you have an A!");
            } else if (finalGrade >= 80) {
                System.out.println("you have a B!");
            } else if (finalGrade >= 67) {
                System.out.println("you have a C ):");
            } else if (finalGrade >= 60) {
                System.out.println("you have a D really sad ");
            } else if (finalGrade >= 0) {
                System.out.println("you are failing. And need help! you have an F");
            } else {
                System.out.println("sorry I dont understand what that is :?");
            }
            System.out.println("would you like to continue?  yes or  no");
            userChoice = scanner.next();
            if (userChoice.equals("no")) {

            }
        } while (userChoice.equals("yes"));
        System.out.println("Thank you for participating");
    }

}
