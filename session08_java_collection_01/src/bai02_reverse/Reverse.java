package bai02_reverse;

import java.util.ArrayList;
import java.util.List;

//Viết chương trình để tạo một danh sách (List) chứa các số nguyên và đảo ngược danh sách (không được sử dụng hàm đảo ngược có sẵn trong List).
//Hướng dẫn:
//B1: tạo 1 List
//B2: thêm một số phần tử vào list
//B3: duyệt for i, với i từ list.size() -> 0, add từng phần tử thứ i vào list mới.
public class Reverse {
    public static void main(String[] args) {
//B1: tạo 1 List
        List <Integer> list = new ArrayList<Integer>();
//B2: thêm một số phần tử vào list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Original list: " + list);
//B3: duyệt for i, với i từ list.size() -> 0, add từng phần tử thứ i vào list mới.
        List <Integer> newList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        System.out.println("Revered list: " + newList);
    }
}
