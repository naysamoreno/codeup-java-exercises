public class Bird {
    // can it fly?
    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // what kind of bird?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // make sure this is not an Integer ...
        // make sure user is logged in
        this.name = name;
    }

    public void makeNoise(){
        System.out.println(this.getName() + " goes ");
    }

    public void move(){
        System.out.println("Flap flap");
    }
    public Bird(){
        System.out.println("A bird just got created");
    }
}
