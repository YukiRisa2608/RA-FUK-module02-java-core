package bai_tap_string.bai04_split;
//Đề bài: Viết một phương thức Java để tách một chuỗi thành một mảng các từ
//Hướng dẫn: Sử dụng phương thức split() của String.
public class bai04_split {
    public static void main(String[] args) {
        String string = "Hello Vietnamese";
        String[] stringArrays = string.split(" "); //Tách theo khoảng trắng
        for (String chars: stringArrays) {
            System.out.println(chars);
        }

    }
}
