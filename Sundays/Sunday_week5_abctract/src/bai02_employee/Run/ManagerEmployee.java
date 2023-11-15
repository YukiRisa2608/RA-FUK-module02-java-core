package bai02_employee.Run;

import bai02_employee.ClassModalEmployee.*;
import bai02_employee.Implement.ValidationLogic;

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
public class ManagerEmployee {
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> experiencList = new ArrayList<>();
    static List<Employee> internList = new ArrayList<>();
    static List<Employee> fresherList = new ArrayList<>();
    static List<Employee> allEmployeesList = new ArrayList<>();

    public static void addAllEmployees() {
        allEmployeesList.addAll(experiencList);
        allEmployeesList.addAll(internList);
        allEmployeesList.addAll(fresherList);
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    private static void menu() {
        System.out.println("___EMPLOYEE MANAGEMENT___");
        System.out.println("1. Add employee");
        System.out.println("2. Edit employee");
        System.out.println("3. Delete employee");
        System.out.println("4. Find all intern employees");
        System.out.println("5. Find all experience employees");
        System.out.println("6. Find all fresher employees");
        System.out.println("7. Find all employees");
        System.out.println("8. Exit");
        System.out.println("________________");
        System.out.println("Choose menu: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addNewEmployee();
                break;
            case 2:
//                editEmployee();
                break;
            case 3:
//                deleteEmployee();
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
                displayAllEmployee();
                break;
            case 8:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice, please try again!");
        }
    }

    private static void deleteEmployee() {
        System.out.println("Enter ID to delete");
        int deleteId = scanner.nextInt();
        scanner.nextLine();
        //chua xong
    }

    //Display all employees
    private static void displayAllEmployee() {
        System.out.println("All employees:");
        displayEmployees(allEmployeesList);
    }
    //Find all experience employees
    private static void findAllExperienceEmployee() {
        System.out.println("Experience Employees:");
        displayEmployees(experiencList);
    }
    //Find all intern employees
    private static void findAllInternEmployee() {
        System.out.println("Intern Employees:");
        displayEmployees(internList);
    }
    //Find all fresher employees
    private static void findAllFresherEmployee() {
        System.out.println("Intern Employees:");
        displayEmployees(internList);
    }
    //Display employee
    private static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            employee.showInfo();
            System.out.println("________________");
        }
    }

    //Add new employee
    private static void addNewEmployee() {
        System.out.println("___CHOOSE EMPLOYEE TYPE___");
        System.out.println("1. Experience");
        System.out.println("2. Intern");
        System.out.println("3. Fresher");

        int choiceEmployeeType = scanner.nextInt();
        scanner.nextLine();

        switch (choiceEmployeeType) {
            case 1:
                addExperience();
                break;
            case 2:
                addIntern();
                break;
            case 3:
                addFresher();
                break;
        }
    }

    private static void addFresher() {
        System.out.println("___ADD FRESHER");
        //Gọi hàm nhập thông tin chung
        Employee employeeInfo = inputCommonInfo();

        //Nhập thông tin thuộc tính riêng cho experience
        System.out.println("Enter graduate date:");
        String graduateDate = scanner.nextLine();

        System.out.println("Enter graduate rank:");
        String graduateRank = scanner.nextLine();

        System.out.println("Enter graduate school:");
        String graduateSchool = scanner.nextLine();

        //Gọi hàm nhập thông tin bằng cấp
        List<Certificate> certificates = addCertificate(employeeInfo);

        //Tạo đối tượng Experience và lưu vào danh sách
        Fresher newFresher = new Fresher(
                employeeInfo.getId(), employeeInfo.getName(), employeeInfo.getBirthDay(), employeeInfo.getPhone(), employeeInfo.getEmail(),
                employeeInfo.getEmployeeType(), certificates, graduateDate, graduateRank, graduateSchool);

        fresherList.add(newFresher);
        System.out.println("Add new fresher employee Successfully!");

    }

    private static void addIntern() {
        System.out.println("___ADD INTERN___");
        //Gọi hàm nhập thông tin chung
        Employee employeeInfo = inputCommonInfo();

        //Nhập thông tin thuộc tính riêng cho experience
        System.out.println("Enter major:");
        String major = scanner.nextLine();

        System.out.println("Enter semester:");
        String semester = scanner.nextLine();

        System.out.println("Enter university name:");
        String universityName = scanner.nextLine();

        //Gọi hàm nhập thông tin bằng cấp
        List<Certificate> certificates = addCertificate(employeeInfo);

        //Tạo đối tượng Experience và lưu vào danh sách
        Intern newIntern = new Intern(
                employeeInfo.getId(), employeeInfo.getName(), employeeInfo.getBirthDay(), employeeInfo.getPhone(), employeeInfo.getEmail(),
                employeeInfo.getEmployeeType(), certificates, major, semester, universityName);

        internList.add(newIntern);
        System.out.println("Add new intern employee Successfully!");

    }

    private static void addExperience() {
        System.out.println("___ADD EXPERIENCE___");
    //Gọi hàm nhập thông tin chung
        Employee employeeInfo = inputCommonInfo();

    //Nhập thông tin thuộc tính riêng cho experience
        System.out.println("Enter experience years:");
        int expYears = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter professional skill:");
        String proSkill = scanner.nextLine();

    //Gọi hàm nhập thông tin bằng cấp
        List<Certificate> certificates = addCertificate(employeeInfo);

    //Tạo đối tượng Experience và lưu vào danh sách
    Experience newExperience = new Experience(
            employeeInfo.getId(), employeeInfo.getName(), employeeInfo.getBirthDay(), employeeInfo.getPhone(), employeeInfo.getEmail(),
            employeeInfo.getEmployeeType(), certificates, expYears, proSkill);

            experiencList.add(newExperience);
        System.out.println("Add Experience Successfully!");
    }

    //Hàm nhập thông tin bằng cấp
    public static List<Certificate> addCertificate(Employee employee) {
        System.out.println("Enter number of certificates:");
        int numOfCertificates = scanner.nextInt();
        scanner.nextLine();

        List<Certificate> certificates = new ArrayList<Certificate>();

        for (int i = 0; i < numOfCertificates; i++) {
            System.out.println("Enter information about certificate: " + (i + 1));

            System.out.println("Enter certificate ID");
            int certificateID = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter certificate NAME");
            String certificateName = scanner.nextLine();

            System.out.println("Enter certificate RANK");
            String certificateRank = scanner.nextLine();

            System.out.println("Enter certificate DATE: yyyy-mm-dd");
            String certificateDate = scanner.nextLine();
            while (!ValidationLogic.isValidDate(certificateDate)) {
                System.out.println("Invalid date, please try again");
                certificateDate = scanner.nextLine();
            }

            //Tạo đối tượng certificate và thêm vào danh sách bằng cấp
            Certificate newCertificate = new Certificate();
            newCertificate.setCertificatedID(certificateID);
            newCertificate.setCertificateName(certificateName);
            newCertificate.setCertificateRank(certificateRank);
            newCertificate.setCertificateDate(certificateDate);

            //Sử dụng phương thức addCertificate của employee để thêm chứng chỉ cho nhân viên
            employee.addCertificate(newCertificate);
        }
        return certificates;
    }

    //Nhập thông tin chung, tạo đối tượng employee chứa thông tin chung
    public static Employee inputCommonInfo() {
        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        while (!ValidationLogic.isValidName(name)) {
            System.out.println("Invalid Name, input again.");
            name = scanner.nextLine();
        }

        System.out.println("Enter birth day: yyyy-mm-dd");
        String birthDay = scanner.nextLine();
        while (!ValidationLogic.isValidDate(birthDay)) {
            System.out.println("Invalid Birth Day, input again");
            birthDay = scanner.nextLine();
        }

        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        while (!ValidationLogic.isValidPhoneNumber(phone)) {
            System.out.println("Invalid Phone Number, input again:");
            phone = scanner.nextLine();
        }

        System.out.println("Enter email:");
        String email = scanner.nextLine();
        while (!ValidationLogic.isValidEmail(email)) {
            System.out.println("Invalid Email, input again");
            email = scanner.nextLine();
        }

        System.out.println("Enter employee type");
        String employeeType = scanner.nextLine();

        Employee employeeInfo = new Employee();
        employeeInfo.setId(id);
        employeeInfo.setName(name);
        employeeInfo.setBirthDay(birthDay);
        employeeInfo.setPhone(phone);
        employeeInfo.setEmail(email);
        employeeInfo.setType(employeeType);
        return employeeInfo;
    }
}