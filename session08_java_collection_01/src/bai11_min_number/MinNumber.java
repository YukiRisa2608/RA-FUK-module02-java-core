package bai11_min_number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Viết một chương trình Java để tìm kiếm phần tử nhỏ nhất trong một danh sách
// sử dụng phương thức Collections.min() của lớp Collections.
public class MinNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println("Min number is: " + Collections.min(list));
    }
}
