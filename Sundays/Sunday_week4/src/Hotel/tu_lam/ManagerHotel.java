package Hotel.tu_lam;

import java.util.Scanner;

//Yêu cầu 3: Xây dựng Lớp ManagerHotel với các phương thức thêm mới, xoá khách theo số chứng minh nhân dân. Tính tiền thuê phòng cho khách(xác định khách bằng số chứng minh nhân dân) dựa vào công thức: (số ngày thuê * giá của từng loại phòng
//Tạo menu chức năng:
//Thêm người thuê phòng0
//Xóa người thuê theo CMND
//Tính tiền của người thuê theo CMND
//Show thông tin theo customer theo CMND, và phòng thuê
//Show tất cả thông tin của người thuê và phòng thuê
//Exit
public class ManagerHotel {
    private Room[] rooms = new Room[10];
    private int countRoom = 0;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("---MENU---");
            System.out.println(
                            "1. Thêm người thuê phòng\n" +
                            "2. Xóa người thuê theo CMND\n" +
                            "3. Tính tiền của người thuê theo CMND\n" +
                            "4. Show thông tin theo customer theo CMND, và phòng thuê\n" +
                            "5. Show tất cả thông tin của người thuê và phòng thuê\n" +
                            "6. Exit"
            );
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //Add customer
                    addCustomer(scanner);
                    break;
                    case 2:
                    //Delete customer by cmnd
                    deleteCustomerByCmnd(scanner);
                    break;
                    case 3:
                    //Caculate Money
//                    caculateMoney();
                    break;
                    case 4:
                    //Show customer(cmnd, room)
//                    showInfoCustomer();
                    break;
                    case 5:
                    //Show all customers and rooms
//                    showAllCustomerAndRooms();
                    break;
                    case 6:
                    //Exit
                        System.exit(0);
                    break;
                default:
                    System.out.println("Unknown, try again");
            }

        } while (choice != 6);
    }

//add customer
    public void addCustomer(Scanner scanner) {
        System.out.println("Input number of customers to add");
        int numberOfCustomer = scanner.nextInt();
        int indexQuantity = 0;
        while (indexQuantity < numberOfCustomer) {
            System.out.println("-------------");
            System.out.println("Input information of customer " + (indexQuantity + 1));
            System.out.println("Input name:");
            String name = scanner.nextLine();
            System.out.println("Input age:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input cmnd number:");
            int cmnd = scanner.nextInt();
            scanner.nextLine();

            Customer customer = new Customer(name, age, cmnd);

            System.out.println("Input rent days");
            int rentDays = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input room type: A, B, C");
            String roomType = scanner.nextLine().toUpperCase();
            int price;
            switch (roomType) {
                case "A":
                    price = Room.ROOM_A_PRICE;
                    break;
                case "B":
                    price = Room.ROOM_B_PRICE;
                    break;
                case "C":
                    price = Room.ROOM_C_PRICE;
                    break;
                default:
                    price = 0;
                    break;
            }
            //Tạo đối tượng room mới gán vào mảng room tại vị trí countRoom
            rooms[countRoom] = new Room(rentDays, price, customer);
            //Tăng số lượng phòng
            countRoom++;
            //Tăng số lượng người thuê phòng
            indexQuantity++;
        }
    }
//delete customer
    private void deleteCustomerByCmnd(Scanner scanner) {
        System.out.println("Input cmnd to delete");
        int delCmnd = scanner.nextInt();
        Customer delCustomer = getCustomerByCmnd(delCmnd);
        if (delCustomer != null) {
            for (int i = countRoom + 1; i < countRoom; i++) {
                rooms[i - 1] = rooms[i];
                countRoom--;
                System.out.println("Deleted");
            }
        } else {
            System.out.println("Not found");
        }
    }
//Get customer by cmnd
    public Customer getCustomerByCmnd(int findCmnd) {
        for (int i = 0; i < countRoom; i++) {
            if (rooms[i].getCustomer().getCmnd() == findCmnd) {
                return rooms[i].getCustomer();
            }
        }
        return null;
    }
}
