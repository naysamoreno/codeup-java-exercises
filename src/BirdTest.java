public class BirdTest {
    public static void main(String[] args) {
//        Bird cardinal = new Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        mallard.makeNoise();

        Finch lesserGoldfinch = new Finch();
        lesserGoldfinch.setName("Lesser Goldfinch");
        lesserGoldfinch.makeNoise();

        Penguin penguin = new Penguin();
        penguin.setName("Emperor Penguin");
        penguin.setCanFly(false);
        penguin.makeNoise();
        penguin.move();

        Bird myPenguin = new Penguin();

    }

}
