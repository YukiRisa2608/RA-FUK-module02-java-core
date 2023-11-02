package bai04_find_number_scanner;

import java.util.Arrays;
import java.util.Scanner;

//Bài tập tìm kiếm tuyến tính trong mảng số nguyên
//Mục tiêu: sử dụng tìm kiếm tuyến tính số nhập vào
//Đề bài: Viết chương trình tìm kiếm tuyến tính trong mảng số nguyên, nhập giá trị cần tìm từ bàn phím.
// In ra vị trí của giá trị cần tìm nếu nó có trong mảng, ngược lại in ra thông báo không tìm thấy.

public class FindNumberInArray {
    public static void main(String[] args) {
        int[] numbers = GetNumbers();
        Search(numbers);
    }

    public static int[] GetNumbers() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public static boolean Search(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number to search ");
        int inputNumber = scanner.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (inputNumber == arr[i]) {
                 System.out.println("Found number " + arr[i] + " at position " + i);
                 flag = true;
                 break;
                }
        }
            if (!flag) {
                 System.out.println("Not found");
            }
        return flag;
    }
}
