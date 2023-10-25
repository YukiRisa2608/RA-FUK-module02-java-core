package bai11_QLSV;

import java.util.Scanner;

// Tạo lớp StudentManager có
// 1 thuôc tính là mảng các sinh viên,
// các phương thức tĩnh như : createStudent(), updateStudent(int id), showAllStudent() và deleteStudent(int id)
// lần lượt là thêm mới, sửa, hiển thị danh sách và xoá sinh viên.
public class StudentManager {
//Khai báo một mảng students để lưu trữ danh sách các sinh viên.
   private static Student[] students;
//Khai báo biến count để theo dõi số lượng sinh viên hiện tại trong danh sách.
   private static int count;
//Hàm tạo constructor của lớp StudentManager, mảng students được khởi tạo với kích thước size.
   public StudentManager(int size) {
        students = new Student[size];
        count = 0;
   }
// Phương thức thêm một sinh viên vào danh sách students.
// Nếu danh sách chưa đầy, sinh viên sẽ được thêm vào mảng students, count tăng lên một đơn vị.
    public static void createStudent(Student student) {
        if (count < students.length) {
            //thêm một đối tượng sinh viên student vào mảng students tại vị trí count
            students[count] = student;
            count++;
        } else {
            System.out.println("Student list is full, cannot create.");
        }
    }
//Update student, Nếu sinh viên tại vị trí i có id trùng với id cần cập nhật,
//thay thế đối tượng sinh viên cũ bằng đối tượng updatedStudent.
    public static void updateStudent(int updateId, Student updateStudent) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == updateId) {
                students[i] = updateStudent;
                return;//kết thúc phương thức và thoát khỏi vòng lặp, vì đã tìm thấy và cập nhật sinh viên cần thiết.
            } else {
                System.out.println("Not found!");
            }
        }
    }
//Show student
    public static void showAllStudents() {
       for (Student student : students) {
           if (student != null) {
               student.displayData();
           } else {
               System.out.println("Student list is empty!");
           }
       }
    }
//Delete student
    public static void deleteStudent(int deleteId) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == deleteId) {
                for (int j = i; j < count - 1; j++) {
                    // Di chuyển tất cả các sinh viên sau vị trí i lên một vị trí
                    students[j] = students[j + 1];
                }
                // Đặt phần tử cuối cùng (vị trí count - 1) là null
                students[count - 1] = null;
                // Giảm số lượng sinh viên đi 1
                count--;
                // Kết thúc vòng lặp khi đã xoá
                return;
            } else {
                System.out.println("Not found ID!");
            }
        }
    }
    //Bước 3: tạo phương thức main() trong lớp StudentManager và tạo menu thực thi chương trình quản lí sinh viên :
    //Menu gồm :
    //Hiển thị danh sách sinh viên
    //Thêm mới sinh viên\
    //Update thông tin sinh viên theo id
    //Xoá sinh viên theo id
    //Thoát
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of students list");
        int size = scanner.nextInt();
        scanner.nextLine();
        // Khai báo mảng để lưu trữ sinh viên
        Student[] students = new Student[size];
        int count = 0; //Đếm số lượng sv
       int choice = 0;
        do {
            System.out.println("___MENU___");
            System.out.println(
                    "1. Hiển thị danh sách sinh viên\n" +
                    "2. Thêm mới sinh viên\\\n" +
                    "3. Update thông tin sinh viên theo id\n" +
                    "4. Xoá sinh viên theo id\n" +
                    "5. Thoát\n"
            );
            choice = scanner.nextInt();
            switch (choice) {
                case 1: //1. Hiển thị danh sách sinh viên
                    StudentManager.showAllStudents();
                    break;
                case 2: //2. Thêm mới sinh viên
                    Student newStudent = new Student();
                    newStudent.inputData();
                    createStudent(newStudent);
                    break;
                case 3: //Update thông tin sinh viên theo id
                    System.out.println("Input ID to update");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    Student updateStudent = new Student();
                    updateStudent.inputData();
                    updateStudent(updateId, updateStudent);
                    break;
                case 4:
                    System.out.println("Input ID to delete");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    deleteStudent(deleteId);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 5);
    }
}
