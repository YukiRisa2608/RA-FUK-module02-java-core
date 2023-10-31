package bai05_min_word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Viết chương trình cho sẵn một đoạn văn hoặc một câu, và tìm ra chữ ngắn nhất (ít ký tự nhất) trong câu
//Hướng dẫn:
//B1: tạo sẵn 1 string = 1 câu hoặc một đoạn văn
//B2: convert string đó thành list các string
//B3: tạo thêm một List có kdl là String để lưu trữ những phần tử đc tìm thấy
//B3: duyệt list trên bằng vòng lặp để tìm ra các phần tử có length nhỏ nhất.
//B4: in ra kết quả.
public class FindMinWord {
    public static void main(String[] args) {
//B1: tạo sẵn 1 string = 1 câu hoặc một đoạn văn
        String s = "Viết chương trình cho sẵn một đoạn văn";
//B2: convert string đó thành list các string
        String[] words = s.split(" ");
//B3: tạo thêm một List có kdl là String để lưu trữ những phần tử đc tìm thấy
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(words));
//B3: duyệt list trên bằng vòng lặp để tìm ra các phần tử có length nhỏ nhất.
        //Tạo một danh sách mới để lưu trữ các từ có độ dài nhỏ nhất
        List<String> shortWordsList = new ArrayList<String>();
        int minLength = words[0].length(); //Khởi tạo minLength với độ dài của từ đầu tiên
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minLength) {
                minLength = words[i].length();
                shortWordsList.clear();
                shortWordsList.add(words[i]);
            } else if (words[i].length() == minLength) {
                shortWordsList.add(words[i]);
                //Tại sao khi gộp điều kiện này vào if trên thì kết quả lại sai? (if (words[i].length() <= minLength)
            }
        }
        System.out.println("Shortest words: ");
        for (String shortestWords : shortWordsList) {
            System.out.println(shortestWords);
        }
    }
}
