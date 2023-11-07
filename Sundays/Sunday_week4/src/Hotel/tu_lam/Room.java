package Hotel.tu_lam;

import Hotel.tu_lam.Customer;

//Yêu cầu 2: Xây dựng lớp Room để quản lý các thông tin về các phòng trong khách sạn
//Để quản lý khách hàng đến thuê phòng của một khách sạn,
// người ta cần các thông tin sau: Số ngày thuê, loại phòng, thông tin cá nhân của những người thuê phòng.
//Biết rằng phòng loại A có giá 500$, phòng loại B có giá 300$ và loại C có giá 100$.
public class Room {
    public static final int ROOM_A_PRICE = 500;
    public static final int ROOM_B_PRICE = 300;
    public static final int ROOM_C_PRICE = 100;
    private int rentDays;
    private int roomPrice;
    private Customer customer;

    public Room() {
    }

    public Room(int rentDays, int roomPrice, Customer customer) {
        this.rentDays = rentDays;
        this.roomPrice = roomPrice;
        this.customer = customer;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
