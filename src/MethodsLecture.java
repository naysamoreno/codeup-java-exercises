import java.util.Scanner;

public class MethodsLecture {
    public static void sayHello() {
        System.out.println("Sorry, I'm in a bit of a rush. Have a great day!");
    }

    public static String sayHello(String name) {
        System.out.printf("Hi my name is %s! I hope you have a beautiful day!%n", name);
        return name;
    }
    public static void sayHello(String salutation, String name) {
        System.out.printf("%s there! My name is %s! Have a great day!%n", salutation, name);
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void willYouTakeUsToMtSplashmore(Scanner sc) {
        System.out.printf("%nWill you take us to Mt. Splashmore?%n");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            willYouTakeUsToMtSplashmore(sc);
        } else {
            System.out.println("Thank you! I can't wait");
        }
    }
    public static void bottlesOfBlank(String beverage, int numBottles) {
        if(numBottles == 0) {
            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around%nAll of the bottle of %s on the wall%n", beverage, beverage, beverage);
        } else if (numBottles == 1) {
            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else if (numBottles == 2) {
            System.out.printf("2 bottles of %s on the wall%n2 bottles of %s%nTake 1 down, pass it around%n1 bottle of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else {
            System.out.printf("%d bottles of %s on the wall%n%d bottles of %s%nTake 1 down, pass it around%n%d bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles - 1, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        }
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Hello", "Naysa");
        sayHello("Naysa");
        System.out.println(multiply(5,2));
        int product = multiply(7,3);
        System.out.printf("did you know %d x %d = 's %d", product, product, product * product);
        Scanner sc = new Scanner(System.in);
        willYouTakeUsToMtSplashmore(sc);
    }
}
