package bai05_qlsv;
//Xây dựng menu chức năng bao gồm :
//Hiển thị danh sách tất cả học sinh
//Thêm mới học sinh
//Sửa thông tin học sinh dựa vào mã học sinh
//Xoá học sinh
//Thoát

import java.util.Scanner;

//Xây dựng lớp Student gồm các thuộc tính như: mã HS, tên HS, tuổi, giới tính, địa chỉ và số điện thoại.
public class Student {
    private String studentCode;
    private String name;
    private int age;
    private String gender;
    private String address;
    private int phone;
// các phương thức khởi tạo (constructor) 0 tham số và có tham số,
    public Student() {
    }

    public Student(String studentCode, String name, int age, String gender, String address, int phone) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
//getter cho studen code để dùng khi sửa, xóa sinh vien bằng code
    public String getStudentCode() {
        return this.studentCode;
    }
// phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng,
    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student code: ");
        String studentCode = scanner.nextLine();
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();
        scanner.nextLine(); //để không bị nuốt dòng
        System.out.println("Input gender");
        String gender = scanner.nextLine();
        System.out.println("Input address");
        String address = scanner.nextLine();
        System.out.println("Input phone number");
        int phone = scanner.nextInt();
    }
// phương thức displayData() cho phép hiển thị toàn bộ thông tin học sinh.
    public void displayData() {
        System.out.println("Student code: " + studentCode);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phone);
    }
}
