package bai02_employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//5. Viết chức năng cho phép thêm, sửa (Nhập ID để xác định một nhân viên, nếu tồn tại
//cho phép người dùng chỉnh sửa thông tin của nhân viên),
// xóa(xóa theo ID) các loại nhân viên trên.
//6. Viết các hàm kiểm tra tính hợp lệ của ngày sinh, email, tên và số điện thoại của nhânviên.
// Áp dụng các hàm này vào chức năng số 1.
//7. Viết chương trình tìm tất cả các nhân viên intern.
//8. Viết chương trình tìm tất cả các nhân viên experience .
//9. Viết chương trình tìm tất cả các nhân viên fresher.
public class ManagementEmployee {
    List<Employee> employees = new ArrayList<Employee>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("___EMPLOYEE MANAGEMENT___");
            System.out.println("1. Add employee");
            System.out.println("2. Edit employee");
            System.out.println("3. Delete employee");
            System.out.println("4. Find all intern employees");
            System.out.println("5. Find all experience employees");
            System.out.println("6. Find all fresher employees");
            System.out.println("7. Exit");
            System.out.println("Choose menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice != 7);
        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                editEmployee();
                break;
            case 3:
                deleteEmployee();
                break;
            case 4:
                findAllInternEmployee();
                break;
            case 5:
                findAllExperienceEmployee();
                break;
            case 6:
                findAllFresherEmployee();
                break;
            case 7:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice, please try again!");
        }
    }

    private static void addEmployee() {
        System.out.println("___________________");
        System.out.println("___ENTER EMPLOYEE INFO___");

        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter birth day:");
//        Date birthDay = new Date
        System.out.println("Select Employee type: 1.Experience  2.Fresher  3.Intern");
        int employeeType = scanner.nextInt();
        scanner.nextLine();


    }

    private static void editEmployee() {
    }

    private static void deleteEmployee() {
    }

    private static void findAllInternEmployee() {
    }

    private static void findAllExperienceEmployee() {
    }

    private static void findAllFresherEmployee() {
    }
}

