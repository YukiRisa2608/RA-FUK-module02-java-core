package bai02_shape;

public class Square extends Rectangle implements Colorable {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
//lớp Square triển khai interface này với phương thức howToColor() hiển thị thông điệp Color all four sides..
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..\n");
    }
}
