package shapes;

// extends quadrilateral.java
// implements measurable.java
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public void setLength(double number) {
        this.length = number;
    }
    @Override
    public void setWidth(double number) {
        this.width = number;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

}




