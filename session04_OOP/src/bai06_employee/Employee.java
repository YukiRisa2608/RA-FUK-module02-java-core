package bai06_employee;

import java.util.Scanner;

public class Employee {
//Xây dựng lớp Employee gồm các thuộc tính như: mã nhân viên(employeeId), tên nhân viên (employeeName) , tuổi (age), giới tính (gen), hệ số lương(rate) và lương(salary).
    int employeeId;
    String name;
    int age;
    String gender;
    double rate;
    double salary;
// các phương thức khởi tạo (constructor) 0 tham số và có tham số,

    public Employee() {
    }
    public Employee(int employeeId, String name, int age, String gender, double rate) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }
// phương thức inputData() cho phép người dùng nhập vào toàn bộ thông tin của đối tượng trừ lương,
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input ID: ");
        employeeId = scanner.nextInt();
        scanner.nextLine();  // Đọc dòng trống
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input age: ");
        age = scanner.nextInt();
        scanner.nextLine();  // Đọc dòng trống
        System.out.print("Input gender: ");
        gender = scanner.nextLine();
        System.out.print("Input rate: ");
        rate = scanner.nextDouble();
    }
// phương thức displayData() cho phép hiển thị toàn bộ thông tin nhân viên,
    public void displayData() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + salary);
    }
// phương thức calSalary() cho phép tính lương nhân viên theo công thức salary = rate * 1.300.000 .
    public void calSalary() {
        salary = rate * 1300000;
    }
}
