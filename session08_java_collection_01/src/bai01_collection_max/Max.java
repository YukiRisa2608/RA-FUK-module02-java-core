package bai01_collection_max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Viết một chương trình Java tạo ngẫu nhiên một List số nguyên có tối đa 10 phần tử rồi in list số nguyên đó,
// sau đó sử dụng phương thức Collections.max() của lớp Collections để tìm và in ra phần tử lớn nhất.
//Hướng dẫn:
//sử dụng hàm Math.random() để lấy số lượng phần tử ngẫu nhiên của list
//duyệt vòng lặp để gán giá trị ngẫu nhiên cho từng phần tử
//in ra List ngẫu nhiên đó.
//tìm ra phần tử lớn nhất
//in phần tử lớn nhất ra.
public class Max {
    public static void main(String[] args) {
        //Đối tượng ArrayList để lưu trữ các số nguyên.
        //được khai báo dưới dạng một đối tượng của interface List với kiểu dữ liệu là Integer.
        List<Integer> numbers = new ArrayList<Integer>();
        //size = 10 phần tử,0-9
        int random10 = (int) (Math.random() * 10);
        //duyệt vòng lặp để gán giá trị ngẫu nhiên cho từng phần tử
        for (int i = 0; i < random10; i++) {
            // giá trị cửa mỗi phần tử chạy từ 0 đến 99
            int randomValue = (int) (Math.random() * 1000);
            //Thêm số nguyên ngẫu nhiên vào danh sách
            numbers.add(randomValue);
            //in ra List ngẫu nhiên đó.
            System.out.println("Numbers list: " + numbers);
            //tìm ra phần tử lớn nhất
            int max = Collections.max(numbers);
            //in phần tử lớn nhất ra
            System.out.println("Max numbers is: " + max);

        }
    }
}
