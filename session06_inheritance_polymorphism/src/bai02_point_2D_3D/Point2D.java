package bai02_point_2D_3D;

import java.util.Arrays;

public class Point2D {
    private float x, y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
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
        return String.format("Point 2D: " + Arrays.toString(getXY()));
    }
}
