package bai05_forEach;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

//Bài tập 5: Sử dụng forEach() trong java 8
//Đề bài: Lọc và hiển thị các số lớn hơn một giá trị xác định từ một mảng số nguyên:
//Hướng dẫn làm bài:
//Bước 1: Tạo một mảng số nguyên.
//Bước 2: Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào.
//Bước 3: Sử dụng phương thức forEach() để in các số đã lọc ra màn hình.
public class forEach {
    public static void main(String[] args) {
        List<Integer> randomNumbers = new Random().ints(10, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Random numbers ");
        System.out.println(randomNumbers);
        //biến cục bộ (local variable) trong một phạm vi được sử dụng trong biểu thức lambda cần phải có giá trị không thay đổi sau khi được gán một lần.
        //biến không cần phải được khai báo là final, nhưng giá trị của nó phải là "effectively final".
        //Lý do sử dụng mảng là vì mảng là một thực thể tham chiếu (reference type),
        //khi thay đổi giá trị của phần tử trong mảng, thì mảng vẫn là cùng một thực thể
        final int[] x = {0};
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input a number");
                x[0] = Integer.parseInt(scanner.nextLine());
                break; // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (Exception e) {
                System.err.println("Input a number");
            }
        } while (true);
        System.out.println(x);
        System.out.println(randomNumbers);
        randomNumbers.stream()
                .filter(i -> i > x[0])
                .forEach(i -> System.out.println(i));
    }
}
