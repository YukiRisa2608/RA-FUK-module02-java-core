package bai01_sum;

import java.util.Scanner;

//[Bài tập] tính tổng số nguyên
//Mục tiêu: luyện tập ném và bắt ngoại lệ
//Đề bài:  Viết một chương trình Java để tính tổng của hai số nguyên nhập vào từ bàn phím.
// Nếu người dùng nhập vào một giá trị không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
//Hướng dẫn làm bài:
//- Bước 1: Khai báo biến
//Khai báo hai biến nguyên để lưu giá trị hai số.
//- Bước 2: Lặp cho đến khi nhập đúng
//Bắt đầu một vòng lặp.
//Trong vòng lặp, thực hiện các bước sau:
//Hiển thị thông báo yêu cầu người dùng nhập số thứ nhất.
//Sử dụng try-catch để bắt ngoại lệ khi người dùng nhập giá trị không phải số nguyên. Nếu ngoại lệ xảy ra, hiển thị thông báo lỗi và yêu cầu nhập lại.
//Lặp lại quá trình trên cho số thứ hai.
//- Bước 3: Tính tổng và hiển thị kết quả
//Sau khi đã nhập được hai số nguyên, tính tổng của chúng.
//In ra kết quả tổng.
//- Bước 4: Kết thúc chương trình
//Kết thúc chương trình sau khi tính tổng và hiển thị kết quả.
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int b = 0;
        int a = 0;
        while (!flag) {
            try {
                System.out.println("Input first number");
                a = Integer.parseInt(scanner.nextLine());

                System.out.println("Input second number");
                b = Integer.parseInt(scanner.nextLine());

                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
