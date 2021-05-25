public class ControlFlowExercises {
    public static void main(String[] args) {
//        long i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        long i= 0;
        do {
            System.out.println(i+=2);
        } while (i > 100);
    }
}
