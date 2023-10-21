package bai_tap_string.bai06_insert;
//Đề bài: Viết một chương trình Java để chèn một chuỗi vào vị trí bất kỳ trong một StringBuilder.
//Hướng dẫn: Sử dụng phương thức insert() của lớp StringBuffer để chèn vào chuỗi từ vị trí quy định.
public class bai06_insert {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Rikkei Academy");
        System.out.println(stringBuilder.insert(0, "Hello! "));
    }
}
