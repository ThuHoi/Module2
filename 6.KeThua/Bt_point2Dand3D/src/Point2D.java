public class Point2D {
    double x = 0.0f;
    double y = 0.0f;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.setX(x);
        this.setY(y);

    }

    public double[] getXY() {
        double[] array = {this.getX(), this.getY()};
                return array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                "}";
    }
}
