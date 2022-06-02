public class MoveablePoint extends Point2D {
    double xSpeed = 0.0f;
    double ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public double[] getSpeed() {
        double[] arr = {getxSpeed(), getySpeed()};
        return arr;
    }

    public MoveablePoint move() {
        setxSpeed(getX() + xSpeed);
        setySpeed(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + getX() +
                ", y=" + getY() +
                "}";
    }
}
