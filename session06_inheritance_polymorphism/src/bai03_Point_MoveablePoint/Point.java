package bai03_Point_MoveablePoint;

public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        x = 0f;
        y = 0f;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] xyValues = {x, y};
        return xyValues;
    }

    @Override
    public String toString() {
        return String.format("x = %f, y = %f", x, y);
    }
}
