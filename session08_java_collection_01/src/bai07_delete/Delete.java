package bai07_delete;

import java.util.ArrayList;
import java.util.List;

//Đề bài: Viết chương trình để tạo một ArrayList chứa các số nguyên và xóa tất cả các số chẵn trong danh sách.
//Hướng dẫn:
//B1: tạo 1 list số nguyên,
//B2: thêm phần tử vào list
//b3: tạo list số nguyên mới để lưu những số nguyên không chia hết cho 2
//B4: duyệt list đó và gán những số thỏa mãn điều kiện vào list mới.
public class Delete {
    public static void main(String[] args) {
//B1: tạo 1 list số nguyên,
        List<Integer> list = new ArrayList<Integer>();
//B2: thêm phần tử vào list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("Original list: " + list);
//b3: tạo list số nguyên mới để lưu những số nguyên không chia hết cho 2
        List<Integer> oddList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                oddList.add(list.get(i));
            }
        }
        System.out.println("Odd list: " + oddList);
    }
}
