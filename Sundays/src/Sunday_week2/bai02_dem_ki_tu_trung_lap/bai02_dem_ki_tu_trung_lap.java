package Sunday_week2.bai02_dem_ki_tu_trung_lap;
//Bài 2: Viết chương trình Java để đếm và in tất cả các kí tự có trùng lặp(kí tự đó xuất hiện 2 lần trở lên) trong chuỗi đầu vào.
//Ví dụ:
//Chuỗi đã cho là: w3resource
//Các ký tự có trùng lặp và số lượng trùng lặp là:
//e xuất hiện 2 lần
//r xuất hiện 2 lần
public class bai02_dem_ki_tu_trung_lap {
    public static void main(String[] args) {
        String input = "w3resourcer";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                continue;
            }
        int count = 1;
            for (int j = i + 1; j < input.length(); j++) {
                if (c == input.charAt(j)) {
                    count++;
                    input = input.substring(0, j) + input.substring(j + 1);
                }
            }
            if (count >= 2) {
                System.out.println(c + " xuat hien " + count + " lan" );
            }
        }
    }
}
