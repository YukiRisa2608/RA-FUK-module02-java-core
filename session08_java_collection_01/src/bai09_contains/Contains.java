package bai09_contains;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//Viết một chương trình Java để xóa các phần tử trùng lặp trong một List các số nguyên.
//Hướng dẫn: sử dụng phương thức contains() của lớp list để check trùng lặp
public class Contains {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(5);
        System.out.println("Original list: " + list);
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }
        }
        System.out.println("New list: " + list2);
    }
}
