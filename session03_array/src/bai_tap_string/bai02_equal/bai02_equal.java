package bai_tap_string.bai02_equal;

import java.util.Scanner;

//Đề bài: Viết một chương trình Java để kiểm tra xem hai chuỗi có giống nhau hay không,
// sử dụng phương thức equals() của String
public class bai02_equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first string");
        String input1 = sc.nextLine();
        System.out.println("Input second string");
        String input2 = sc.nextLine();
        if (input1.equals(input2)) {
            System.out.println("Input1 same as input2");
        } else {
            System.out.println("Input2 different from input1");
        }
    }
}
