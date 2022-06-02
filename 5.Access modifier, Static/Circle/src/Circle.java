public class Circle {
    protected double radius = 1.0;
    protected String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }
}
