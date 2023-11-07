package bai01_vehicle;
//Các xe máy có các thuộc tính riêng: công xuất.
public class Motorbike extends Vehicle{
    private int power;

    public Motorbike() {
    }

    public Motorbike(int id, String manufacturer, int year, double price, String color, int power) {
        super(id, manufacturer, year, price, color);
        this.power = power;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorbike: ");
        super.displayDetails();
        System.out.printf("Power %d%n", power);
    }
}
