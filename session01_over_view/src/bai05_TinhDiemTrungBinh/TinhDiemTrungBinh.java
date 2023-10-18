package bai05_TinhDiemTrungBinh;

import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Toán: ");
        float toan = sc.nextFloat();
        System.out.println("Nhập điểm Lý: ");
        float ly = sc.nextFloat();
        System.out.println("Nhập điểm Hóa: ");
        float hoa = sc.nextFloat();
        System.out.println("Nhập điểm Văn: ");
        float van = sc.nextFloat();
        System.out.println("Nhập điểm Anh: ");
        float anh = sc.nextFloat();
        float diemTB = (toan + ly + hoa + van + anh) / 5;
        System.out.println("Điểm trung bình của học sinh đó là: " + diemTB);
        if (diemTB < 5) {
            System.out.println("Xếp loại học lực: Yếu");
        }
         else if (diemTB < 6) {
            System.out.println("Xếp loại học lực: Trung Bình");
        }
         else if (diemTB < 8) {
            System.out.println("Xếp loại học lực: Khá");
        }
        else if (diemTB < 9) {
            System.out.println("Xếp loại học lực: Giỏi");
        }
        else  {
            System.out.println("Xếp loại học lực: Xuất sắc");
        }

    }

}
