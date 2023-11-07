package bai01_vehicle;
//Ngành công an cần quản lý các phương tiện giao thông gồm: ô tô, xe máy, xe tải.
//Mỗi loại gồm các thông tin: ID, Hãng sản xuất, năm sản xuất, giá bán và màu xe.
public class Vehicle {
    protected int id;
    protected String manufacturer;
    protected int year;
    protected double price;
    protected String color;

    public Vehicle() {
    }

    public Vehicle(int id, String manufacturer, int year, double price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public void displayDetails() {
        System.out.printf(
                "ID: %d, manufacturer: %s, year: %d, price: %.2f, color: %s%n", id, manufacturer, year, price, color);
    }
}
