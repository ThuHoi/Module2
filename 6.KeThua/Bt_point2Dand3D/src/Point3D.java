public class Point3D extends Point2D {
    double z = 0.0f;

    public Point3D() {
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public double[] getXYZ() {
        double[] array = {super.getX(), super.getY(), this.getZ()};
                return  array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + super.getX() +
                ", x=" + super.getY() +
                ", y=" + getZ() +
                "}";
    }
}
