package bai01_vehicle;
//Các ô tô có các thuộc tính riêng: số chỗ ngồi, kiểu động cơ.
public class Car extends Vehicle{
    private int seatNumber;
    private String enginType;

    public Car() {
    }

    public Car(int id, String manufacturer, int year, double price, String color, int seatNumber, String enginType) {
        super(id, manufacturer, year, price, color);
        this.seatNumber = seatNumber;
        this.enginType = enginType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: ");
        super.displayDetails();
        System.out.printf("Seat %d, Engine Type %s%n", seatNumber, enginType);
    }
}
