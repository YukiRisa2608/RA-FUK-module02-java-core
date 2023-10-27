package bai03_Point_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed, ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this(0.0f, 0.0f, xSpeed, ySpeed);
    }
    public MovablePoint() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float y) {
        this.ySpeed = y;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() + ", MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move() {
        float x = getX() + xSpeed;
        float y = getY() + ySpeed;
        setXY(x, y);
        return this;
    }
}
