package bai02_find_min;

import java.util.Arrays;
//hãy in ra mảng số nguyên đó
//tìm số nhỏ nhất bằng thuật toán tìm kiếm tuyến tính và in ra nó.
//Hướng dẫn:
//B1: tạo 1 mảng số nguyên và gọi hàm getArr() để gán
//B2: in ra mảng số nguyên đó
//B3: cài đặt thuật toán tuyến tính để tìm ra số nhỏ nhất
//B4: in số nhỏ nhất ra.
public class FindMin {
    public static void main(String[] args) {
//B1: tạo 1 mảng số nguyên và gọi hàm getArr() để gán
        int[] numbers = GetArr();
//B2: in ra mảng số nguyên đó
        System.out.println(Arrays.toString(numbers));
//B4: in số nhỏ nhất ra.
        int minNum = FindMin(numbers);
        System.out.println("Min number is:" + minNum);

    }

        //đoạn code sau trả về 1 mảng ngẫu nhiên 20 số tự nhiên
    private static int[] GetArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

//B3: cài đặt thuật toán tuyến tính để tìm ra số nhỏ nhất (duyệt tùng phần tử theo thưứ tự và kiểm tra có khớp với đièu kiẹn hay ko)
    public static int FindMin(int[] numbers) {
        //gán min là số ở vị trí đầu tiên
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
