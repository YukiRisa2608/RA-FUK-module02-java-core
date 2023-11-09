package bai02_employee.ClassModalEmployee;

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

        System.out.println("Select Employee type: 1.Experience  2.Fresher  3.Intern");
        int choiceEmployeeType = scanner.nextInt();
        scanner.nextLine();

        Enum.EmployeeType employeeType = null;
        switch (choiceEmployeeType) {
            case 1:
                employeeType = Enum.EmployeeType.EXPERIENCE;
                break;
            case 2:
                employeeType = Enum.EmployeeType.FRESHER;
                break;
            case 3:
                employeeType = Enum.EmployeeType.INTERN;
                break;
        }

        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter birth day: dd/mm/yyyy");
        String birthDay = scanner.nextLine();
        while (!isValidBirthDay(birthDay)) {
            System.out.println("Invalid birthday, please try again");
            birthDay = scanner.nextLine();
        }

        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        scanner.nextLine();
        while (!isValidPhoneNumber(phone)) {
            System.out.println("Invalid phone number, please try again.");
            phone = scanner.nextLine();
        }

        System.out.println("Enter email:");
        String email = scanner.nextLine();
        while (!isValidEmail(email)) {
            System.out.println("Invalid email, please try again.");
            email = scanner.nextLine();
        }

    //Add certificate
        ArrayList<Certificate> certificates = new ArrayList<>();
        addCertificates(certificates);
    //Employee type
        switch (employeeType) {
            case EXPERIENCE: //Experience
                System.out.println("Enter experience years:");
                int expInYear = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter professional skills:");
                String proSkills = scanner.nextLine();

                Experience experience = new Experience(id, name, birthDay, phone, email, employeeType, expInYear, proSkills);

        }
    }
    //Add certificates
    public static void addCertificates(ArrayList<Certificate> certificates) {
        System.out.println("Enter number of certificates to add");
        int numberOfCertificates = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfCertificates; i++) {
            System.out.println("CERTIFICATE " + (i + 1));

            System.out.println("Enter certificate ID:");
            int certificateID = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter certificate NAME:");
            String certificateName = scanner.nextLine();

            System.out.println("Enter certificate RANK:");
            String certificateRank = scanner.nextLine();

            System.out.println("Enter certificate DATE: dd/mm/yyyy");
            String certificateDate = scanner.nextLine();

            Certificate certificate = new Certificate (certificateID, certificateName, certificateRank, certificateDate);
            certificates.add (certificate);

            System.out.println("Add certificate " + (i + 1) + " successfully");
        }

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

    //Validate birth day
    public static boolean isValidBirthDay(String birthDay) {
        return birthDay.matches("^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/(19|20)\\d\\d$");
    }

    //Valid Email
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    //Validate phone number
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Số điện thoại từ 10 đến 14 chữ số
        String phoneRegex = "^(\\+\\d{1,3}[- ]?)?\\d{10,14}$";
        return phoneNumber.matches(phoneRegex);
    }

}

