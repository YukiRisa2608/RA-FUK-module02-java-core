package bai02_point_2D_3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        this(0.0f, 0.0f, 0.0f);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        this.getX();
        this.getY();
        this.z = z;
    }

    @Override
    public float getX() {
        return super.getX();
    }

    public float[] getXYZ() {
        float[] xyzValues = {getX(), getY(), z};
        return xyzValues;
    }

    @Override
    public String toString() {
        return String.format("Point 3D: " + Arrays.toString(getXYZ()));
    }
}
