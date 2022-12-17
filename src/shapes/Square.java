package shapes;

// extends quadrilateral
public class Square extends Quadrilateral {

    public Square(double num) {
        super(num, num);
    }

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public void setLength(double num) {
        this.length = num;
    }

    @Override
    public void setWidth(double num) {
        this.width = num;
    }
}