package shapes;

public class Square extends Rectangle {

//    private int side;

    public Square(int side){
        super(side, side);
    }

    @Override
    public int getPerimeter() {
        return (2*this.rectangleLength) + (2*this.rectangleWidth);
    }

    @Override
    public int getArea() {
        return this.rectangleLength * this.rectangleWidth;
    }

}
