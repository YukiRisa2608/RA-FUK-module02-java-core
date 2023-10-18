package bai_tap.bai01;

import java.util.Scanner;

//Trong phần này, chúng ta sẽ phát triển một chương trình thực hiện xoá một phần tử được nhập vào từ bàn phím ra khỏi mảng,nếu phần tử đó xuất hiện trong mảng.
public class bai01_del_index_array {
    public static void main(String[] args) {
        //Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        //Khai báo kiểu dữ liệu nhập
        int N = sc.nextInt();
        //Tạo mảng với kích thước N
        int [] numbers = new int[N];
            System.out.println("Nhập " + N + " số" );
        //Gán giá trị vào mảng
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + numbers[i]);
        }
        //Bước 2: Nhập X là phần tử cần xoá
        System.out.println("Nhập phần tử muốn xóa");
         int  x  = sc.nextInt();
         //Bước 3: Tìm X xem có xuất hiện trong mảng không.
        // Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: index_del
        int index_del = -1; // không tìm thấy trả về -1
        for (int i = 0; i < N; i++) {
            if (numbers[i] == x) {
                index_del = i; // Lưu vị trí của X
                break; // Dừng tìm kiếm khi tìm thấy X
            }
        }
        if (index_del > -1) {
            //Duyệt mảng từ vị trí cần xoá (index_del) đến cuối mảng (array.length-1)
            for (int i = index_del; i < N - 1; i++) {
                numbers[i] = numbers[i + 1]; //Gán phần tử ở vị trí index cho phần tử ở vị trí index + 1
            }
            N--; // Giảm kích thước mảng sau khi xoá
        }
        //Bước 5:  Kết thúc duyệt mảng. In ra mảng.
        System.out.println("Mảng sau khi xoá phần tử " + x + ":");
        for (int i = 0; i < N; i++) {
        System.out.println("Phần tử thứ " + i + " là: " + numbers[i]);
        }
    }
}

