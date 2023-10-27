package bai03_Point_MoveablePoint;

public class TestMovePoint {
    public static void main(String[] args) {
        Point p = new Point(1f, 2f);
        System.out.println("Point: " + p);

        MovablePoint m = new MovablePoint(1f, 2f, 3f, 4f);
        System.out.println("Movable Point: " + m);

        m.move();
        System.out.println("After moved: " + m);
    }
}
