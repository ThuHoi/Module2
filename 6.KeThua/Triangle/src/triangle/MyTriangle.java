package triangle;

public class MyTriangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public MyTriangle() {
    }

    public MyTriangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", Area =" + getArea() +
                ", Perimeter =" + getPerimeter() +
                "}";
    }
}
