package Hotel.chua_bai;
public class Room {

    enum TypeRoom {
        A,
        B,
        C
    }

    private TypeRoom typeRoom;
    private int roomNo;
    private String customer = "";

    public Room(TypeRoom typeRoom, int roomNo) {
        this.typeRoom = typeRoom;
        this.roomNo = roomNo;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public void checkin(String indentifier) {
        this.customer = indentifier;
    }

    public int checkout() {
        this.customer = "";
        return getPrice();
    }

    public int getNo() {
        return roomNo;
    }

    public String getCustomer() {
        return customer;
    }

    public String getTypeName() {
        switch (typeRoom) {
            case A:
                return "A";
            case B:
                return "B";
            case C:
                return "C";
            default:
                return "";
        }
    }
    public boolean isAvailable() {
        return customer == null || customer.isEmpty();
    }

    public int getPrice() {
        switch (typeRoom) {
            case A:
                return 500;
            case B:
                return 300;
            case C:
                return 100;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "   So phong %d:" + "\n" +
                        "   Loai Phong: %s" + "\n" +
                        "   Tinh trang: %s" + "\n", roomNo, getTypeName(), isAvailable() ? "Con trong" : "da cho thue");
    }
}

