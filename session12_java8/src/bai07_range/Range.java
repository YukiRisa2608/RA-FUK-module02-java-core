package bai07_range;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Bài tập 7: SỬ dụng phương thức range()
//Đề bài: Tạo danh sách số nguyên từ một dãy số từ x đến y
//Hướng dẫn làm bài:
//Bước 1: Nhập hai số nguyên x và y từ người dùng.
//Bước 2: Sử dụng Stream API và phương thức range() để tạo danh sách các số từ x đến y.
public class Range {
    public static void main(String[] args) {
        int x, y;
        while (true) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input start number");
            x = Integer.parseInt(scanner.nextLine());
            System.out.println("Input end number");
            y = Integer.parseInt(scanner.nextLine());

            List<Integer> list = IntStream.range(x, y + 1)
                    .boxed()
                    .collect(Collectors.toList());
            System.out.println("list number form x to y: " + list);
            break; // Thoát khỏi vòng lặp nếu nhập đúng.
        } catch (Exception e) {
            System.err.println("Input a number");
        }
        }
    }
}
