package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return radius * Math.PI * 2;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }

}
