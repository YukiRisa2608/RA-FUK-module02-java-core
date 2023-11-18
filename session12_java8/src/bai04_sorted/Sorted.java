package bai04_sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Hướng dẫn làm bài:
//Bước 1: Tạo một danh sách chuỗi.
//Bước 2: Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.
public class Sorted {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("tạo", "một", "danh", "sách", "chuỗi");
        System.out.println(words);
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedWords);
    }
}
