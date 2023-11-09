package bai02_shape;

public class Main {
    public static void main(String[] args) {
        //Tạo một mảng các đối tượng hình học trong đó có ít nhất một Square.
        // Với mỗi phần tử trong mảng, hiển thị diện tích của nó,
        // nếu phần tử đó là một Colorable, gọi phương thức howToColor().
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3, "blue", false);
        shapes[1] = new Rectangle(3, 6, "blue", false);
        shapes[2] = new Square(3, "blue", true);

        System.out.println("TEST");
        for (Shape s : shapes) {
            System.out.println("Area: " + s.getArea());
            if (s instanceof Colorable) {
                ((Colorable) s).howToColor();
            }
        }


//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape() {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);

        shape = new Shape("red", false) {
            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
