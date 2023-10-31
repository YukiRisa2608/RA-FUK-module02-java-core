package bai08_addAll;

import java.util.ArrayList;
import java.util.List;

//Viết một chương trình Java để sao chép tất cả các phần tử của một danh sách sang một danh sách khác
// sử dụng phương thức addAll() của lớp List.
//Hướng dẫn: sử dụng phương thức addAll()
public class AddAll {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Viết một chương trình Java để sao chép tất cả");
        List<String> list2 = new ArrayList<String>();
        list2.addAll(list);
        System.out.println("list1: " + list);
        System.out.println("list2: " + list2);
    }
}
