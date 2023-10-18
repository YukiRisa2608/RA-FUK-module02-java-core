import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        bai04();
        }

    public static void bai04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh");
        int soLuongHocSinh = sc.nextInt();
        sc.nextLine();
        String[] tenHocSinh = new String[soLuongHocSinh];
        double[][] diemHocSinh = new double[soLuongHocSinh][];
        int i = 0;
        for (String ten: tenHocSinh) {
            System.out.println("Nhap ten hoc sinh thu " + (i + 1));
            tenHocSinh[i] = sc.nextLine();
        i++;
        }
            System.out.println("Nhap so mon hoc");
            int soMonHoc = sc.nextInt();
            sc.nextLine();
    }
}

