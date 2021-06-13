public class ServerNameGenerator {
    private static String[] adj = {"cool", "nice", "sweet", "merry", "loving", "kind", "colorful", "simple","caring","mean"};
    private static String[] nouns = {"wombat", "kangaroo", "turtle", "bunny", "koala", "bird", "lizard", "snake","bear","lion"};

    private static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }
    public static String makeServerName(String[] array1, String[] array2){
        String adj = randomElement(array1);
        String noun = randomElement(array2);
        return adj + "-" + noun;

    }

    public static void main(String[] args) {
        System.out.println("your new server name is \n" + makeServerName(adj, nouns));
    }
}
