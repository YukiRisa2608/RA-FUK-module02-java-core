package bai01_vehicle;
//Xe tải cần quản lý thêm: Trọng tải.
public class Truck extends Vehicle{
    private double payload;

    public Truck() {
    }

    public Truck(int id, String manufacturer, int year, double price, String color, double payload) {
        super(id, manufacturer, year, price, color);
        this.payload = payload;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck: ");
        super.displayDetails();
        System.out.printf("Payload %.2f%n", payload);
    }
}
