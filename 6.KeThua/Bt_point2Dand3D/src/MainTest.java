public class MainTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(50.5f, 30);
        System.out.println(point2D);

        Point3D point3D = new Point3D(30, 40.5f, 64.5f);
        System.out.println(point3D);

        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 4.5, 5.5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
