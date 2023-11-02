package bai03_find_number_scanner_matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//In mảng đó ra
//Sử dụng thuật toán tìm kiếm để tìm số nhập vào từ bàn phím, nếu có in ra các vị trí trả về true, nếu không có trả false
//Hướng dẫn:
//B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean
//B2: trong hàm tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
//B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
//B4: tạo biến check dkl boolean, mặc định =  false
//B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều, nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
//B6: in ra các vị trí và trả về biến check
public class FindNUmberInMatrixFromScanner {
// phương thức sau rả về 1 mảng 2 chiều có 20x20 phần tử ngẫu nhiên từ 0 đến 99.
    public static int[][] GetArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
//B1: tạo 1 hàm tìm kiếm có kdl trả về là Boolean
    public static boolean FindNumber(int[][] arr) {
//In mảng đó ra
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j] + ", ");
            }
        System.out.println();
        }
//B3: tạo 2 List có kiểu dữ liệu là int để lưu những vị trí số đó xuất hiện.
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();
//B4: tạo biến check dkl boolean, mặc định =  false
        boolean check = false;
// B5: Lấy số nhập từ bàn phìm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number to search");
        int inputNumber = scanner.nextInt();
//B5: sử dụng vòng lặp lồng nhau duyệt qua tất cả phần tử của mảng 2 chiều,
// nếu có phần tử trùng ta sẽ add vị trí vào 2 list ở trên và đổi biết check = true.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]  == inputNumber) {
                    rows.add(i);
                    cols.add(j);
                    check = true;
                }
            }
        }
//B6: in ra các vị trí và trả về biến check
//nếu có in ra các vị trí trả về true, nếu không có trả false
        if (check) {
//hai danh sách rows va cols cùng kích thước, nen chỉ cần duyệt qua một trong hai danh sách với số lần bằng kích thước của danh sách đó.
            System.out.println("Number "+ inputNumber + " found at:");
            for (int n = 0; n < rows.size(); n++) {
                System.out.println("row " + rows.get(n) + ", column " + cols.get(n));
            }
        } else {
            System.out.println("Number " + inputNumber + ": " + "not found");
        }
        return check;
    }
    //Test
    public static void main(String[] args) {
   // trong hàm main tạo 1 mảng 2 chiều và gọi hàm getArr() để gán.
        int[][] matrix = GetArr();
        FindNumber(matrix);
    }
}
