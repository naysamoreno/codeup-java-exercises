import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's up my name is Bob... someone said you wanted to talk?" );
        String response = "";
        while (!response.equalsIgnoreCase("QUIT!")) {
            System.out.println("What do you want?");
            response = sc.nextLine();
            if (response.isEmpty()) {
                System.out.println("Fine, dont talk to me");
            } else if (response.endsWith("?")) {

            }
        }
    }
}
