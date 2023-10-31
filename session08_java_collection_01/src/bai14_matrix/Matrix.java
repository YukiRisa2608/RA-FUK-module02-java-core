package bai14_matrix;

import java.util.ArrayList;
import java.util.Random;

//Tạo 1 ma trận vuông với kích thước ngẫu nhiên trong khoảng 1-10 sử dụng aray list,
// thêm phẩn tử ngẫu nhiên có giá trị từ 0-100 và in ra.
public class Matrix {
    public static void main(String[] args) {
    Random random = new Random();
    // kết quả của nextInt(10) sẽ là số từ 0 đến 9
     // random.nextInt(10) + 1 sẽ tạo ra số nguyên từ 1 đến 10
    int size = random.nextInt(10) + 1;
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
    for (int i = 0; i < size; i++) {
        //Trong mỗi vòng lặp ngoài,tạo một hàng mới
        ArrayList row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
            //thêm giá trị ngẫu nhiên từ 0 đến 100 vào mỗi phần tử trong hàng.
                int n = random.nextInt(101);
                row.add(random.nextInt());
                System.out.print(row.get(j) + "   ");
            }
            //thêm vào ma trận
            matrix.add(row);
        System.out.println();
        System.out.println();
        }
    }
}
