package bai_tap_string.bai03_reverse;
//Đề bài: Viết một phương thức Java để đảo ngược một chuỗi, sử dụng StringBuffer.
//Hướng dẫn:
//Dùng phương thức reverse() của lớp StringBuffer để đảo ngược chuỗi hiện tại
public class bai03_reverse {
    public static void main(String[] args) {
        //chuỗi ban đầu
        String input = "RIKKEI AKADEMY";
        // Tạo một đối tượng StringBuffer với chuỗi ban đầu
        StringBuffer stringBuffer = new StringBuffer(input);
        // Sử dụng phương thức reverse() để đảo ngược chuỗi
        stringBuffer.reverse();
        // Chuyển đối tượng StringBuffer thành chuỗi
        String reverseString = stringBuffer.toString();
        //Print
        System.out.println("Original string: " + input);
        System.out.println("String reverse: " + reverseString);
    }
}
