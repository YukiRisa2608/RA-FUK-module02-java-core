package bai02_employee;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

//Tất cả các Employee đều có các thuộc tính và phương thức là:
//- ID
//- FullName
//- BirthDay
//- Phone
//- Email
//- Employee_type
//- Employee_count
//- Phương thức là showInfo để hiển thị thông tin của nhân viên đó (hiển thị thông tin
//nhân viên ra màn hình console).
//Trong đó :
//employeeType có giá trị tương ứng là 0: Experience, 1: Fresher , 2: Intern (tùy vào người
//dùng nhập vào ứng viên loại nào)
//employeeCount dùng để người dùng đếm số lượng nhân viên trong một đợt người dùng nhập
//nhân viên mới vào cơ sở dữ liệu. (mỗi lần người dùng nhập thêm mới nhân viên thì thuộc tính
//employeeCount của class Employee sẽ tăng lên 1)
public abstract class Employee {
    private int id;
    private String name;
    private String birthDay;
    private String phone;
    private String email;
    private Enum.EmployeeType employeeType;
    private ArrayList<Certificate> certificates;
    private static int employee_count = 0;

    public Employee() {
    }

    public Employee(int id, String name, String birthDay, String phone, String email, Enum.EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.certificates = new ArrayList<>();
        employee_count++;
    }
    public void addCertificates(int certificatedId, String certificatedName, String certificateRank, String certificateDate) {
        Certificate certificate = new Certificate (certificatedId, certificatedName, certificateRank, certificateDate);
        certificates.add(certificate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enum.EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setType(Enum.EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public static int getEmployee_count() {
        return employee_count;
    }

    public static void setEmployee_count(int employee_count) {
        Employee.employee_count = employee_count;
    }
    public void showInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Full Name: " + name);
        System.out.println("BirthDay: " + birthDay);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Employee Type: " + employeeType);
        System.out.println("Certificates: ");
        for (Certificate certificate : certificates) {
            System.out.println("Certificate ID: " + certificate.getCertificatedID());
            System.out.println("Certificate Name: " + certificate.getCertificateName());
            System.out.println("Certificate Rank: " + certificate.getCertificateRank());
            System.out.println("Certificate Date: " + certificate.getCertificateDate());
        }
    }
}
