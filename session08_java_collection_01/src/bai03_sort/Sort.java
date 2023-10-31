package bai03_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Viết chương trình để tạo một danh sách (List) chứa các số nguyên và sắp xếp danh sách theo thứ tự giảm dần.
//Hướng dẫn: sử dụng phương thức Collection.sort().
public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(30);
        System.out.println("Original list " + list);
        Collections.sort(list);
        System.out.println("After sort " + list);
    }
}
