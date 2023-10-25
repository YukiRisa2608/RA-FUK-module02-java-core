package bai11_QLSV;

import java.util.Scanner;

//Tất cả thuộc tính có access modifier là private.
//.Các phương thức getter/setter, constructor
//Phương thức inputData() cho phép nhập vào toàn bộ thông tin của đối tượng
// và displayData() hiển thị toàn bộ thông tin của đối tượng đó
public class Student {
    //properties
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;
//getters
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public boolean isSex() {
        return sex;
    }
    public String getClassName() {
        return className;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
//setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Constructor

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex,String className, int age , String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;

    }
//Phương thức inputData() cho phép nhập vào toàn bộ thông tin của đối tượng
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input student ID");
        int studentiId = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Input student name");
        String studentName = scanner.nextLine();

        System.out.println("Input sex(true = male, false = female)");
        boolean sex = scanner.nextBoolean();

        System.out.println("Input class name");
        className = scanner.nextLine();

        System.out.println("Input age");
        age = scanner.nextInt();

        System.out.println("Input address");
        address = scanner.nextLine();
    }
    //displayData() hiển thị toàn bộ thông tin của đối tượng đó
    public void displayData() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Sex: " + sex);
        System.out.println("Class name: " + className);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
