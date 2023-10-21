package bai_tap_array.bai09_tim_so_lon_thu_hai;
//Tìm phần tử lớn thứ 2 trong Mảng
public class bai09_FindSecondMaxNumber {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 8, 9, 10, 11, 12, 12, 15, 15, 16, 16};
//        int secondMaxNumber = cach1(numbers);
        int secondMaxNumber = cach2(numbers);
        System.out.println("Second max number is: " + secondMaxNumber);
    }
//Cách 1 : Dùng 2 vòng lăp for :
    public static int cach1 (int[] numbers) {
//Bước 1: dùng vòng lặp for duyệt mảng tìm ra phần tử lớn nhất.
        int firstMaxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstMaxNumber) {
                firstMaxNumber = numbers[i];
            }
        }
//Bước 2: Tiếp theo chúng ta dùng vòng lặp for thứ 2 duyệt mảng tìm phần tử lớn nhất trong các phần tử còn lại,
// loại trừ phần tử lớn nhất trước đó.
        int secondMaxNumber = numbers[0];
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > secondMaxNumber && numbers[i] != firstMaxNumber) {
                secondMaxNumber = numbers[i];
            }
        }
        return secondMaxNumber;
    }
//Cách 2 : Dùng 1 vòng lặp for :
//Chỉ sử dụng một vòng lặp duy nhất để tìm số lớn đứng thứ 2.
// Sử dụng 2 biến trung gian max và max2. Suy nghĩ tư duy logic để giải quyết vấn đề.
    public static int cach2(int[] numbers) {
        int max = numbers[0];
        int max2 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max2 = max;
                max = numbers[i];
            }
        }
        return max2;
    }
}
