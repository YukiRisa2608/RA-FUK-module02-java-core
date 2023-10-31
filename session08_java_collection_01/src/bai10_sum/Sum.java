package bai10_sum;

import java.util.ArrayList;
import java.util.List;

//Viết một chương trình Java để tính tổng của các phần tử trong một danh sách sử dụng phương thức forEach() của lớp List.
public class Sum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(5);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
