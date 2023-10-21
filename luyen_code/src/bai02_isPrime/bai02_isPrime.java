package bai02_isPrime;
//Bài 2:
//Nhập vào một số nguyên, viết hàm kiểm tra số vừa nhập có phải là số nguyên tố hay không?
// Nếu có in ra “True”, ngược lại in ra “False”.
public class bai02_isPrime {
    public static void main(String[] args) {
//        int n = 9;
//        boolean check = isPrime(n);
        if (isPrime(9)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n >= 2;
    }
}
