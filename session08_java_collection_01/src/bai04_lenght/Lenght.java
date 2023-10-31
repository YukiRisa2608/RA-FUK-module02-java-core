package bai04_lenght;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Viết chương trình để tạo một danh sách (List) chứa các chuỗi từ một string cho sẵn và in ra tất cả các chuỗi có độ dài lớn hơn 3 ký tự.
//Hướng dẫn:
//B1: tạo 1 String có giá trị là: “Rekkei Academy để nông dân biết code”
//B2: tạo List có kdl là String.
//B3: convert string ở bước 1 thành List string rồi gán vào Lits đc tạo ở b2.
//B4: duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
public class Lenght {
    public static void main(String[] args) {
//B1: tạo 1 String có giá trị là: “Rekkei Academy để nông dân biết code”
        String s = "Rekkei Academy để nông dân biết code";
//B2: tạo List có kdl là String.
        List<String> list = new ArrayList<String>();
//B3: convert string ở bước 1 thành List string rồi gán vào Lits đc tạo ở b2.
        String[] words = s.split(" ");
        list.addAll(Arrays.asList(words));
//B4: duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
        for (String word : list) {
            if (word.length() >= 3) {
                System.out.println(word);
            }
        }
    }
}
