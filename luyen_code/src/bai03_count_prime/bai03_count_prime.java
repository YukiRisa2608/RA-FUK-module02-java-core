package bai03_count_prime;
//	Nhập vào 1 mảng số nguyên có kích thước n, Đếm xem trong mảng có bao nhiêu số nguyên tố.
public class bai03_count_prime {
    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
    int count = countPrimeNumbers(numbers);
        System.out.println("Count: " + count);
    }
//Kiểm tra là số nguyên tố
    public static boolean isPrime(int num) {
        int i;
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num >= 2;
    }
    //Đếm số nguyên tố
    public static int countPrimeNumbers (int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}
