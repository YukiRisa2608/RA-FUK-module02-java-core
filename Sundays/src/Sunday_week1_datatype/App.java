package Sunday_week1_datatype;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         task1();
//         task2();
//         task3();
//        task4();
    }

    private static void task1() {
        /**
         * Bài 1: Quản lý điểm sinh viên
         * Tạo một chương trình Java để quản lý điểm sinh viên trong một lớp học.
         * Sử dụng một mảng để lưu trữ điểm của các sinh viên. Mỗi phần tử trong mảng sẽ
         * là một điểm của một sinh viên cụ thể (từ 0 đến 100).
         * Cho phép người dùng nhập số lượng sinh viên trong lớp học và điểm của từng
         * sinh viên.
         * Yêu cầu:
         * Hiển thị điểm của tất cả sinh viên cùng với thông tin số thứ tự (index) của
         * từng sinh viên trong mảng.
         * Tính và hiển thị điểm trung bình của cả lớp học.
         * Tìm và hiển thị sinh viên có điểm cao nhất và điểm thấp nhất trong lớp học.
         * Gợi ý:
         * Sử dụng vòng lặp để nhập điểm và lưu trữ vào mảng.
         * Sử dụng vòng lặp để tính tổng điểm và sau đó tính điểm trung bình.
         * Trong quá trình tính điểm trung bình, có thể sử dụng biến tạm thời để tính
         * tổng các điểm.
         * Sử dụng vòng lặp để tìm sinh viên có điểm cao nhất và điểm thấp nhất trong
         * mảng.
         */

        Scanner sc = new Scanner(System.in);
        // Nhập số lượng sinh viên trong lớp học
        System.out.print("Nhập số lượng sinh viên trong lớp học: ");
        int numStudents = sc.nextInt();
        // Khai báo mảng để lưu trữ điểm của sinh viên
        int[] diemSinhVien = new int[numStudents];
        // Nhập điểm của từng sinh viên
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diemSinhVien[i] = sc.nextInt();
        }
        // Hiển thị điểm của tất cả sinh viên
        System.out.println("Điểm của các sinh viên trong lớp học:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ": " + diemSinhVien[i]);
        }
        // Tính điểm trung bình của lớp học
        int sumDiem = 0;
        for (int diem : diemSinhVien) {
            sumDiem += diem;
        }
        double diemTrungBinh = (double) sumDiem / numStudents;
        System.out.println("Điểm trung bình của lớp học: " + diemTrungBinh);
        // Tìm và hiển thị sinh viên có điểm cao nhất và điểm thấp nhất trong lớp học
        int maxDiem = diemSinhVien[0];
        int minDiem = diemSinhVien[0];
        for (int i = 1; i < numStudents; i++) {
            if (diemSinhVien[i] > maxDiem) {
                maxDiem = diemSinhVien[i];
            }
            if (diemSinhVien[i] < minDiem) {
                minDiem = diemSinhVien[i];
            }
        }
        System.out.println("Sinh viên có điểm cao nhất: " + maxDiem);
        System.out.println("Sinh viên có điểm thấp nhất: " + minDiem);
        sc.close();
    }

    private static void task2() {
        /**
         * Bai 2: Quản lý hình học
         * Yêu cầu:
         * Tạo một chương trình Java để quản lý các hình học cơ bản: hình vuông, hình
         * chữ nhật và hình tròn.
         * - Sử dụng switch case để cho phép người dùng chọn loại hình học muốn quản lý.
         * - Nhập các thông tin cần thiết về hình học từ người dùng, chẳng hạn như cạnh
         * của hình vuông, chiều dài và chiều rộng của hình chữ nhật, bán kính của hình
         * tròn.
         * - Tính diện tích và chu vi của hình học tương ứng và hiển thị kết quả.
         * - Nếu người dùng nhập lựa chọn không hợp lệ, thông báo lỗi và yêu cầu người
         * dùng nhập lại.
         */
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Quản lý hình học =====");
            System.out.println("1. Hình vuông");
            System.out.println("2. Hình chữ nhật");
            System.out.println("3. Hình tròn");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập cạnh của hình vuông: ");
                    double side = sc.nextDouble();
                    double squareArea = side * side;
                    double squarePerimeter = 4 * side;
                    System.out.println("Diện tích hình vuông: " + squareArea);
                    System.out.println("Chu vi hình vuông: " + squarePerimeter);
                    break;
                case 2:
                    System.out.print("Nhập chiều dài của hình chữ nhật: ");
                    double length = sc.nextDouble();
                    System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                    double width = sc.nextDouble();
                    double rectangleArea = length * width;
                    double rectanglePerimeter = 2 * (length + width);
                    System.out.println("Diện tích hình chữ nhật: " + rectangleArea);
                    System.out.println("Chu vi hình chữ nhật: " + rectanglePerimeter);
                    break;
                case 3:
                    System.out.print("Nhập bán kính của hình tròn: ");
                    double radius = sc.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    double circleCircumference = 2 * Math.PI * radius;
                    System.out.println("Diện tích hình tròn: " + circleArea);
                    System.out.println("Chu vi hình tròn: " + circleCircumference);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
            System.out.println(); // Xuống dòng để đẹp hơn
        } while (choice != 0);
        sc.close();
    }

    private static void task3() {
        /**
         * Bài 3:Viết chương trình in ra hình như bên dưới.
         * 1
         * 2 1 2
         * 3 2 1 2 3
         * 4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         * 6 5 4 3 2 1 2 3 4 5 6
         * 7 6 5 4 3 2 1 2 3 4 5 6 7
         * 6 5 4 3 2 1 2 3 4 5 6
         * 5 4 3 2 1 2 3 4 5
         * 4 3 2 1 2 3 4
         * 3 2 1 2 3
         * 2 1 2
         * 1
         */
        Scanner sc = new Scanner(System.in);
        // Số dòng của hình
        System.out.print("Hãy nhập một số từ 2~9: ");
        int n = sc.nextInt();
        // In các dòng từ 1 đến 2*n-1
        for (int i = 1; i <= 2 * n - 1; i++) {
            int maxNumberInLine = i <= n ? i : 2 * n - i; // Số lượng số trên mỗi dòng
            // In khoảng trắng phía trước
            for (int j = 1; j <= n - maxNumberInLine; j++) {
                System.out.print("  ");
            }
            // In các số từ i đến 1
            for (int k = maxNumberInLine; k >= 1; k--) {
                System.out.print(k + " ");
            }
            // In các số từ 2 đến i
            for (int k = 2; k <= maxNumberInLine; k++) {
                System.out.print(k + " ");
            }
            System.out.println(); // Xuống dòng sau khi in xong mỗi dòng
        }
        sc.close();
    }

    private static void task4() {
        /**
         * Bài 4: Xếp loại học sinh
         * Yêu cầu:
         * Tạo một chương trình Java để nhập điểm của các học sinh trong một lớp học.
         * - Dùng mảng 1 chiều lưu thông tin tên học sinh.
         * - Dùng mảng 2 chiều để lưu trữ thông tin điểm của các học sinh. Mỗi hàng trong mảng đại diện cho một học sinh và mỗi cột đại diện cho một môn học.
         * - Cho phép người dùng nhập điểm từng học sinh cho các môn học tương ứng.
         * - Tính điểm trung bình của mỗi học sinh và hiển thị xếp loại tương ứng:
         * Điểm trung bình >= 9: Xếp loại "Xuất sắc"
         * Điểm trung bình >= 8: Xếp loại "Giỏi"
         * Điểm trung bình >= 6.5: Xếp loại "Khá"
         * Điểm trung bình >= 5: Xếp loại "Trung bình"
         * Điểm trung bình < 5: Xếp loại "Yếu"
         * - Hiển thị bảng điểm với tên của từng học sinh, điểm từng môn và điểm trung bình cùng với xếp loại.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int numStudents = sc.nextInt();
        System.out.print("Nhập số lượng môn học: ");
        int numSubjects = sc.nextInt();
        double[][] grades = new double[numStudents][numSubjects];
        String[] studentNames = new String[numStudents];
        double[] averages = new double[numStudents];
        // Xóa bộ nhớ đệm sau khi nhập số nguyên
        sc.nextLine();
        // Nhập điểm từng học sinh cho các môn học
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Nhập tên học sinh thứ " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Nhập điểm môn học " + (j + 1) + " của học sinh " + studentNames[i] + ": ");
                grades[i][j] = sc.nextDouble();
            }
            // Tính điểm trung bình của học sinh thứ i
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += grades[i][j];
            }
            averages[i] = sum / numSubjects;
            sc.nextLine(); // Xóa bộ nhớ đệm sau khi nhập số thực
        }
        // Hiển thị bảng điểm và xếp loại
        System.out.println("===== Bảng điểm =====");
        System.out.println("Tên học sinh\t\tĐiểm các môn\t\tĐiểm trung bình\t\tXếp loại");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(studentNames[i] + "\t\t\t");
            System.out.print(Arrays.toString(grades[i]));
            System.out.print("\t\t");
            System.out.print(averages[i] + "\t\t\t");
            if (averages[i] >= 9) {
                System.out.println("Xuất sắc");
            } else if (averages[i] >= 8) {
                System.out.println("Giỏi");
            } else if (averages[i] >= 6.5) {
                System.out.println("Khá");
            } else if (averages[i] >= 5) {
                System.out.println("Trung bình");
            } else {
                System.out.println("Yếu");
            }
        }
        sc.close();
    }
}

