package bai04_triangle;

public class Shape {
    private String color;

    public Shape() {
        this.color = "red";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return String.format("color %s", color);
    }
}
