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

        for (int x =100; x >= -10; i--) {
            System.out.println(x);
            x-=5;
        }
        for (long i =2; i < 1000000; i++) {
            System.out.println(i);
            i*=i;
        }
    }
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

}
