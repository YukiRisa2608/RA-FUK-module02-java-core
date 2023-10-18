public class demo {
    public static void main(String[] args) {
        int chieuDai = 5; // Điều chỉnh chiều dài (số dòng) ở đây

        // Vòng lặp ngoài in ra số dòng (chiều dài)
        for (int i = 1; i <= chieuDai; i++) {
            // Vòng lặp in ra dấu cách trước dấu '*' để dịch sang phải
            for (int j = i; j < chieuDai; j++) {
                System.out.print(" ");
            }

            // Vòng lặp in ra số lượng '*' trong mỗi dòng
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println(); // Xuống dòng sau mỗi dòng in
        }
    }
}
