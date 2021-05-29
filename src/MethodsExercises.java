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

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(subtract(5, 4));
        System.out.println(multiply(9, 50));
        System.out.println(divide(50, 2));
        System.out.println(modulo(9,3));

    }
}
