public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        int myFavoriteNumber = 18;
        System.out.println(myFavoriteNumber);
        String myString = "Happy Birthday";
        System.out.println(myString);
        // I notice that myString prints out in another line
// when changing string to char I get a notice that char is incompatible with a string
//        myString = 3.14159;
        // also not allowed
        long myNumber = 123L;
        System.out.println(myNumber);
        // says the lossy conversion from double to long
        myNumber = 123;
        System.out.println(myNumber);
        // 9 you can fix by casting as float instead of an integer
        double piNumber = 3.14;
        // float does not work but double does
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
    }
}
