import java.util.Scanner;

public class consoleOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.printf("Hello, %s", "David \n");
        String name = "Naysa";
        System.out.format("%d is %s's favorite number \n This is a %b statement ", 42, name, true );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend, how's it going?");
        String userInput = scanner.nextLine();
        // .next() only takes in the next word whereas the nextLine takes in the whole statement
        System.out.printf("You're feeling: %s %n", userInput);
    }
}
