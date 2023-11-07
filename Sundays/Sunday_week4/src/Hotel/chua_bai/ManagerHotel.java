package Hotel.chua_bai;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerHotel {
    static Scanner scanner;
    static List<Customer> customers = new ArrayList<>();
    static List<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        rooms.add(new Room(Room.TypeRoom.A, 1));
        rooms.add(new Room(Room.TypeRoom.A, 2));
        rooms.add(new Room(Room.TypeRoom.A, 3));
        rooms.add(new Room(Room.TypeRoom.B, 4));
        rooms.add(new Room(Room.TypeRoom.B, 5));
        rooms.add(new Room(Room.TypeRoom.B, 6));
        rooms.add(new Room(Room.TypeRoom.C, 7));
        rooms.add(new Room(Room.TypeRoom.C, 8));
        rooms.add(new Room(Room.TypeRoom.C, 9));

        int choice;
        do {
            System.out.println("----- Quản lý Khach san -----");
            System.out.println("1. Thêm người thuê phòng");
            System.out.println("2. Xóa người thuê theo CMND");
            System.out.println("3. Tính tiền của người thuê theo CMND");
            System.out.println("4. Show thông tin cua customer theo CMND, và phòng thuê");
            System.out.println("5. Show tất cả thông tin của người thuê có thuê phòng");
            System.out.println("6. dat phong");
            System.out.println("7. Show tất cả thông tin của người thuê và phòng");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    removeCustomer();
                    break;
                case 3:
                    checkout();
                    break;
                case 4:
                    showCustomerInfo();
                    break;
                case 5:
                    showAllCustomer();
                    break;
                case 6:
                    checkin();
                    break;
                case 7:
                    showAllCustomerAndRoom();
                    break;
                case 0:
                    System.out.println("Chương trình đã thoát. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        } while (choice != 0);


        scanner.close();

    }

    private static void showAllCustomerAndRoom() {
        System.out.println("----- Show tất cả thông tin của người thuê và phòng -----");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }

        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i));
        }

    }

    private static void checkin() {
        System.out.println("----- Dat phong -----");
        System.out.println("Nhập cmnd cua kh");
        String _indentifierNumber = getNextLine(scanner);
        boolean hasUser = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdentifierNumber().equals(_indentifierNumber)) {
                hasUser = true;
                break;
            }
        }
        if (!hasUser) {
            System.out.println("CMND chua duoc dang ky vui long dang ky them");
            return;
        }
        System.out.println("Nhập so phong: ");
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).isAvailable()) {
                System.out.printf("Room %d, Type %s", rooms.get(i).getNo(), rooms.get(i).getTypeName());
                System.out.println();
            }
        }

        int _roomNo = scanner.nextInt();

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getNo() == _roomNo) {
                rooms.get(i).checkin(_indentifierNumber);
            }
        }
    }

    private static void showAllCustomer() {
        System.out.println("----- Show tất cả thông tin của người thuê có thuê phòng -----");
        System.out.println("Nhập cmnd cua kh");

        for (int i = 0; i < rooms.size(); i++) {
            if (!rooms.get(i).isAvailable()) {
                for (int j = 0; j < customers.size(); j++) {
                    if (rooms.get(i).getCustomer().equals(customers.get(j).getIdentifierNumber())) {
                        System.out.println(customers.get(j));
                    }
                }
            }
        }

    }

    private static void showCustomerInfo() {
        System.out.println("----- Show thông tin cua customer theo CMND, và phòng thuê -----");
        System.out.println("Nhập cmnd cua KH");
        String _indentifierNumber = getNextLine(scanner);
        Customer customer = null;
        Room room = null;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdentifierNumber().equals(_indentifierNumber)) {
                customer = customers.get(i);
                break;
            }
        }
        if (customer == null) {
            System.out.println("CMND chua duoc dang ky vui long thu lai");
            return;
        }

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getCustomer().equals(_indentifierNumber)) {
                room = rooms.get(i);
            }
        }

        System.out.printf("Thông tin Khách hàng:");
        System.out.println(customer);
        System.out.println("phòng thuê: " + (room != null ? room.getNo() : "chua co"));
    }

    private static void checkout() {
        System.out.println("----- Tinh tien -----");
        System.out.println("Nhập cmnd cua kh");
        String _indentifierNumber = getNextLine(scanner);
        boolean hasUser = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdentifierNumber().equals(_indentifierNumber)) {
                hasUser = true;
                break;
            }
        }
        if (!hasUser) {
            System.out.println("CMND chua duoc dang ky vui long thu lai");
            return;
        }

        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getCustomer().equals(_indentifierNumber)) {
                int price = rooms.get(i).checkout();
                System.out.printf("Tong tien: %d", price);
                System.out.println();
                return;
            }
        }

        System.out.println("Kh chua thue phong, Vui long kiem tra lai");
    }

    private static void removeCustomer() {
        System.out.println("----- Xoa khách hàng -----");
        System.out.println("Nhập cmnd cua kh muon xoa");
        String _indentifierNumber = getNextLine(scanner);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdentifierNumber().equals(_indentifierNumber)) {
                customers.remove(i);
                return;
            }
        }
    }

    private static void addCustomer() {
        System.out.println("----- Tạo thông tin khách hàng -----");
        System.out.println("1: Nhập tên khách hàng");
        String _name = getNextLine(scanner);

        System.out.println("2: Nhập tuổi khách hàng");
        int _age = scanner.nextInt();

        System.out.println("3: Nhập cmnd");
        String _indentifierNumber = getNextLine(scanner);

        Customer customer = new Customer(_name, _age, _indentifierNumber);
        customers.add(customer);
        System.out.printf("Add user: \\n %s", customer);
        System.out.println();
    }

    private static String getNextLine(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        return scanner.nextLine();
    }
}
