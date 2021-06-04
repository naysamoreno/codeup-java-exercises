package shapes;

public class Square extends Rectangle {
    private double side;
    public Square(double side) {
//        this.length = side;
//        this.width = side;
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
        System.out.println("I am overriding");

        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        System.out.println("I am overriding");
        return super.getPerimeter();
    }

}