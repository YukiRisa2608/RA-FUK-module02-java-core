package Employee_CRUD;

import Student_CRUD.Student;

import java.util.Scanner;

import static Student_CRUD.StudentManagement.createStudent;

        // Bài tập về nhà : xây dựng chương trình quản lý nhân viên  (CRUD)
public class Employee_main {
    private static Employee[] employees = new Employee[10];
    private static int count = 0;
//main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----------MENU QUẢN LÝ NHÂN VIÊN------------");
            System.out.println("1. Hiển thị danh sách nhân viên\n" +
                    "2. Thêm mới nhân viên\n" +
                    "3. Update thông tin nhân viên theo id\n" +
                    "4. Xoá nhân viên theo id\n" +
                    "5. Thoát\n");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = scanner.nextByte();

            switch (choice) {
                case 1:
                    // hiển thị
                    showAllEmployees();
                    break;
                case 2:
                    // thêm mới
                    addEmployee(scanner);
                    break;
                case 3:
                    // cập nhật theo id
                    updateEmployee(scanner);
                    break;
                case 4:
                    // xóa theo id
                    deleteEmployee(scanner);
                    break;
                case 5:
                    // thoát
                    System.exit(0);
                    break;
                default:
                    // nhập sai
                    System.out.println("Nhập không chính xác , vui lòng thử lại");
                    break;
            }
        }

    }
//Add Employee
     private static void addEmployee(Scanner scanner) {
         System.out.println("Nhập số lượng sinh viên cân thêm mới");
         int quantity = scanner.nextInt();
         if(quantity > employees.length-count){
             System.out.println("Vượt quá số lượng");
             return;
         }
         for (int i = 0; i < quantity; i++) {
             System.out.println("________");
             System.out.println("Nhập thông tin nv thu " + (i + 1));
             employees[count] = new Employee();
             employees[count].inputData();
             employees[count].calSalary(); // Tính lương cho nhân viên vừa thêm mới
             count++;
             System.out.println("Thêm nv thành công");
         }
            }

    //Delete
    private static void deleteEmployee(Scanner scanner) {
        System.out.println("Nhập ID cần xóa:");
        int idDel = scanner.nextInt();
        int index = getIndexByEmployeeId(idDel);
        if(index  ==-1){
            System.out.println("Không tìm thấy nhân viên nào phù hợp");
            return;
        }

        // cho phép xóa
       // Khi một nhân viên được xác định cần bị xóa ở vị trí index, việc di chuyển bắt đầu từ vị trí ngay sau nhân viên này, tức index + 1.
        for (int i = index + 1; i < count ; i++) {
           // di chuyển nhân viên tiếp theo lên một vị trí để ghi đè lên vị trí trước đó.
            employees[i - 1] = employees[i];
        }
        employees[count - 1]= null;
        count--;
        System.out.println("Xóa thành công");
    }
//Get ID
    private static int getIndexByEmployeeId(int id) {
        for (int i = 0; i < count; i++) {
            if(id == employees[i].getEmployeeId()){
                return i;
            }
        }
        return -1;
    }
//Update
    private static void updateEmployee(Scanner scanner) {
        System.out.println("Nhập ID của nhân viên cần sửa");
        int idEdit = scanner.nextInt();
        int index = getIndexByEmployeeId(idEdit);
        if(index==-1){
            System.out.println("Không tìm thấy nhân viên nào phù hợp");
            return;
        }

        // cho phép sửa
        System.out.println("------------Thông tin nhân viên cũ---------------");
        System.out.println(employees[index]);
        scanner.nextLine();
        System.out.println("Nhập tên nhân viên mới");
        employees[index].setEmployeeName(scanner.nextLine());
        System.out.println("Nhập giới tính mới : Nam/Nữ");
        //so sánh chuỗi đầu vào có bằng chuỗi "Nam" hay không, bất kể là viết hoa hay viết thường. Nếu chuỗi nhập vào là "Nam", nó sẽ trả về true, ngược lại trả về false.
        employees[index].setGen(scanner.nextLine().equalsIgnoreCase("Nam"));
        System.out.println("Nhập tuổi mới");
        employees[index].setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập rate lương mới");
        employees[index].setRate(Double.parseDouble(scanner.nextLine()));
        employees[index].calSalary(); // Cập nhật lại lương sau khi cập nhật hệ số lương
        System.out.println("Cập nhật thành công");
    }

    private static void showAllEmployees() {
        System.out.println("---DANH SACH NHAN VIEN---");
        if(count==0){
            System.out.println("Danh sách nhân viên trống");
            return;
        }
        // hiển thị danh sách
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]); // gọi đến phương thức toString
        }
    }
}
