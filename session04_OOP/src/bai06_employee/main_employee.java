package bai06_employee;

import java.util.Scanner;

//Bước 2: Tạo lớp Main chưa phương thức main() để chạy chương trình.
//Bước 3: .Trong phương thức main() ,
//Bước 4: Chạy chương trình và quan sát kết quả.
public class main_employee {
    public static void main(String[] args) {
        //khởi tạo 5 đối tượng nhân viên từ lớp Employee,
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("_______________");
            System.out.println("Input employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].inputData();
            // tính lương
            employees[i].calSalary();
        }
        //hiển thị toàn bộ thông tin các nhân viên ra màn hình.
        System.out.println("___EMPLOYEES LIST___");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("__________");
            System.out.println("Employees " + (i + 1));
            employees[i].displayData();
        }
    }
}
