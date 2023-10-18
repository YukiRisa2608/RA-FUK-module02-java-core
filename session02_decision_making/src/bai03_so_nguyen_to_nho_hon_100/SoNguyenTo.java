package bai03_so_nguyen_to_nho_hon_100;
//hiển thị các số nguyên tố nhỏ hơn 100.
//        Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó
//        Sử dụng vòng lặp để duyệt các số từ 2 đến 100, kiểm tra xem số nào là số nguyên tố thì hiển thị ra màn hình.
//        Để kiểm tra một số có phải là số nguyên tố hay không, sử dụng thuật toán: Với một số nguyên dương A lớn hơn 1,
//        kiểm tra từ  2 đến căn bậc 2 của A, nếu A chia hết cho một số trong khoảng đó thì A không phải là số nguyên tố,
//        ngược lại A là số nguyên tố.
public class SoNguyenTo{
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int number = 2; number < 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}

