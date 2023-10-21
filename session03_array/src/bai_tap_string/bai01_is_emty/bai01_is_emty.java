package bai_tap_string.bai01_is_emty;

import java.util.Scanner;

public class bai01_is_emty {
    //Đề bài: Viết một chương trình Java để kiểm tra xem một chuỗi có rỗng hay không,
    // sử dụng phương thức isEmpty() của String.
    public static void main(String[] args) {
//        Bước 1 : Khai báo biến kiểu String gán bằng 1 chuỗi cẩn kiểm tra
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input anything");
        String input = scanner.nextLine();
//        Bước 2 : Kiểm tra điều kiện của với phương thức isEmpty và đưa ra thông báo
        if (input.isEmpty()) {
            System.out.println("The input is empty");
        } else {
            System.out.println("The input is: " + input);
        }
    }
}
