package bai01_stream_API_find_max;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Bài tập 1: Tìm số lớn nhất trong một mảng số nguyên:
//Đề bài: Dùng Stream API để tìm số lớn nhất
//Hướng dẫn làm bài:
//Bước 1: Tạo một mảng số nguyên.
//Bước 2: Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng.
public class FindMax {
    public static void main(String[] args) {
        //Array
//Bước 1: Tạo một mảng số nguyên.
        int[] ints = {1, 2, 3, 4, 11, 12, 13, 55, 92, 36, 55};
//Bước 2: Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng.
        int max = Arrays.stream(ints).max().orElse(0);// Trả về giá trị mặc định nếu mảng rỗng.
        System.out.println("max: " + max);

        //List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 11, 12, 13, 55, 92, 36, 55);
        int maxNumber = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max number in List: " + maxNumber);
    }
}
