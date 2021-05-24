import java.lang.reflect.Array;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please insert an integer ");
        int userInput = scanner.nextInt();


        System.out.println("The number you entered is " +  userInput);
        System.out.println("\n please enter three words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
//        System.out.println("you said the following three words... \n first: " + firstWord + "\n second: " + secondWord + "\n third: " + thirdWord );
        System.out.printf("\"%s\"%n\"%s\"%n\"%s\"%n", firstWord, secondWord, thirdWord);

        System.out.println("please write a sentence");
        String sentence  = scanner.nextLine();
        sentence = scanner.nextLine();
        System.out.printf("your sentence is: %s\n", sentence);

        System.out.println("please give both the length and width and height");
        sentence = scanner.nextLine();

        String[] stringArray = sentence.split(" ", 3);
        double length = Double.parseDouble(stringArray[0]);
        double width = Double.parseDouble(stringArray[1]);
        double height = Double.parseDouble(stringArray[2]);
        System.out.println("the perimeter of your class " + ((length * 2) + (width * 2))+ " \n Area is: " + (length * width) + "\n Your height is: " + height + "\n the volume of the room is: " + (length * width * height));


    }

}
