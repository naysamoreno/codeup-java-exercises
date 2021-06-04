package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
// default constructor
    public Rectangle() {

    }


    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.width * 2) + (this.length * 2);
    }

}