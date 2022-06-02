package colorable;

import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Square();
        System.out.println("Pre-Colorable");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

}
