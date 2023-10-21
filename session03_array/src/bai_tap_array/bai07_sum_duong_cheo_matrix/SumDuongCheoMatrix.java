package bai_tap_array.bai07_sum_duong_cheo_matrix;

import java.util.Scanner;
//Viết một ứng dụng cho phép người dùng nhập vào một ma trận vuông của các số thực,
// sau đó tính ra cho người dùng tổng của các số ở đường chéo chính.
public class SumDuongCheoMatrix {
    public static void main(String[] args) {
        //Khởi tạo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input SIZE of the matrix");
        int size = scanner.nextInt();

        //Khai báo 4444
        int[][] matrix = new int[size][size];

        //Gán giá trị
        System.out.println("___________________________");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Input number at row " + (i +  1) + " column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        //In ra matrix
        System.out.println("___________________________");
        System.out.println("Your matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }
        //Tính tổng đường chéo chính, là các phần tử có chỉ số dòng = chỉ số cột,
        //Ví dụ mảeix[0][0], [1][1], [2][2]
        int sum  = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);

    }
}
