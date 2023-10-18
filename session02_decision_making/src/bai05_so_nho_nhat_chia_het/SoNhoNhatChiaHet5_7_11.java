package bai05_so_nho_nhat_chia_het;
//Hướng dẫn:
//        Bước 1: Khai báo biến N là giá trị bắt đầu kiểm tra ,có giá trị là 1.
//        Bước 2: Sử dụng vòng lặp while để bắt đầu lặp . Kiểm tra giá trị N hiện tại có chia hết cho 5,7 và 11 hay không. Nếu đúng đó chính là giá trị cần tìm và dừng vòng lặp. Nếu sai thì tăng giá trị N thêm 1 và tiến hành kiểm tra lại.
//        Bước 3: Kết thúc vòng lặp , hiển thị số tìm được ra màn hình.
public class SoNhoNhatChiaHet5_7_11 {
    public static void main(String[] args) {
        int soNhoNhat = 1;
        while (true) {
            if (soNhoNhat % 5 == 0 && soNhoNhat % 7 == 0 && soNhoNhat % 11 == 0) {
                break;
            }
            soNhoNhat++;
        }
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11 là: " + soNhoNhat);
    }
}
