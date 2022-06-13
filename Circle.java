package BaiTap7.Colorable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " area= " + getArea() +
                " " +
                super.toString() +
                '}';
    }
}
