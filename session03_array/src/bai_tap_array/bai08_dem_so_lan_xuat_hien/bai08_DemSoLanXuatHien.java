package bai_tap_array.bai08_dem_so_lan_xuat_hien;

import java.util.Scanner;

// cho phép đếm số lần xuất hiện của một ký tự được nhập vào từ bàn phím cho một chuỗi cho trước.
public class bai08_DemSoLanXuatHien {
    public static void main(String[] args) {
        //Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        String chuoi = "RIKKEI AKADEMI FUKUOKA";
        //Bước 2: Khai báo một biến ký tự và gán hoặc nhập từ bàn phím một giá trị.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input characters to count");
        char inputCharToCount = scanner.next().charAt(0);
        //Chuyển đổi về chữ thường
        chuoi = chuoi.toLowerCase();
        inputCharToCount = Character.toLowerCase(inputCharToCount);
        //Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == inputCharToCount) {
                count += 1;
            }
        }
        //In ra kết quả
        System.out.println("Letter " + inputCharToCount + " appear " + count + " times");

    }
}
