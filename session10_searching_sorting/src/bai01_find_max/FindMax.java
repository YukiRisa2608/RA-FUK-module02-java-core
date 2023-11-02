package bai01_find_max;

import java.util.Arrays;

//tìm số lớn nhất bằng thuật toán tìm kiếm tuyến tính và in ra nó.
//Hướng dẫn:
//B1: tạo 1 mảng số nguyên và gọi hàm getArr() để gán
//B2: in ra mảng số nguyên đó
//B3: cài đặt thuật toán tuyến tính để tìm ra số lớn nhất
//B4: in số lớn nhất ra
public class FindMax {
//Đề bài: đoạn code sau trả về 1 mảng ngẫu nhiên 20 số tự nhiên
    private static int[] GetArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    //B3: cài đặt thuật toán tuyến tính để tìm ra số lớn nhất
    public static int FindMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number is: " + max);
        return max;
    }

public static void main(String[] args) {
//B1: tạo 1 mảng số nguyên và gọi hàm getArr() để gán
    int[] numbers = GetArr();
//B2: in ra mảng số nguyên đó
        System.out.println(Arrays.toString(numbers));
//Find max
    FindMax(numbers);

}
}
