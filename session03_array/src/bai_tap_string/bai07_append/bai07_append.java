package bai_tap_string.bai07_append;
//Đề bài: Viết một phương thức Java để thêm một chuỗi vào cuối của một StringBuffer.
// Hướng dẫn: Sử dụng phương thức append() để nối thêm chuỗi trong StringBuffer.
public class bai07_append {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rikkei Akademy");
        System.out.println(stringBuffer.append(" Fukuoka"));
    }
}
