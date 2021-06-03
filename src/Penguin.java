public class Penguin extends Bird {
    // override make noise when penguin
    public void makeNoise(){
        System.out.println(this.getName() + "goes Womp Womp");
    }
    // override move
    public void move() {
        System.out.println(this.getName() + "goes Waddle Waddle");
    }
}
