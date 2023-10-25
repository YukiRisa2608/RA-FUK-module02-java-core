package bai05_qlsv;

import java.util.Scanner;

public class main_student {
    public static void main(String[] args) {
        Student[] studentList = new Student[100];
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int count = -1;
        do {
            System.out.println("____MENU____");
            System.out.println(
                    "0. Hiển thị danh sách học sinh\n" +
                    "1. Thêm mới học sinh\n" +
                    "2. Sửa thông tin học sinh dựa vào mã học sinh\n" +
                    "3. Xoá học sinh\n" +
                    "4. Thoát\n");
            choice =  scanner.nextInt();
            scanner.nextLine(); //enter

            switch (choice) {
                case 0:
                    System.out.println("Students list is: ");
                    for (Student student: studentList) {
                        if(student == null) {
                            System.out.println("EMPTY!");
                            break;
                        } else {
                            student.displayData();
                        }
                    }
                    break;
                case 1:
                    //Khởi tạo nếu danh sách chưa đầy
                    if (count < studentList.length) {
                        //Khởi tạo đối tượng sinh viên
                        Student student = new Student();
                        //gọi phương thức thêm sinh viên đã tạo trước đó
                        student.inputData();
                        //Tạo mảng danh sách sinh viên có size 100 như đề bài, chứa các đối tượng sinh viên
                        studentList[count] = student;
                        //Tăng số lượng sinh viên sau khi thêm
                        count++;
                        System.out.println("Success!");
                    } else {
                        System.out.println("Số lượng học sinh đã đủ 100, không thể thêm mới.");
                    }
                case 2:
                    System.out.println("Nhập mã học sinh cần sửa");
                    String editStudent = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        //Nếu tìm thấy code sv
                        if(studentList[i].getStudentCode().equals(editStudent)) {
                        //Hiển thị thông tin sv đã tìm thấy
                            studentList[i].displayData();
                            System.out.println("Input new info");
                        //Nhập thông tin mới
                            studentList[i].inputData();
                            System.out.println("Updated!");
                            break;  // Thoát khỏi vòng lặp sau khi tìm thấy và sửa thông tin
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Input student code to delete");
                    String deleteStudent = scanner.nextLine();
                    for (int i = 0; i < count; i++) {
                        //Kiểm tra xem mã học sinh tại vị trí hiện tại của vòng lặp có trùng khớp với mã học sinh mà người dùng muốn xoá hay không.
                        if (studentList[i].getStudentCode().equals(deleteStudent)) {
                            for (int j = i; j < count - 1; j++) {
                            //Đây là một vòng lặp for bên trong vòng lặp ngoại cùng.
                            //sẽ di chuyển các phần tử phía sau lên một vị trí để xoá học sinh tại vị trí hiện tại. j đại diện cho vị trí hiện tại,
                            //gán giá trị của phần tử tiếp theo cho phần tử hiện tại.
                                studentList[j] = studentList[j + 1];
                            }
                            count--;
                            System.out.println("Deleted!");
                            //Break để thoát khỏi vòng lặp sau khi xoá học sinh, vì không cần kiểm tra tiếp các phần tử trong danh sách.
                            break;
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    //Mã thoát 0: Thành công.
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown");
            }
        } while (choice != 4);
    }
}
