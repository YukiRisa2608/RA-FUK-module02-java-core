package bai_tap_string.bai08_replace;
//Đề bài: Viết một phương thức Java để thay thế một chuỗi trong một StringBuffer bằng một chuỗi khác.
//Hướng dẫn: Dùng phương thức replace() của lớp StringBuffer thay thế chuỗi bằng chuỗi khác từ vị trị bắt đầu và kết thúc được quy định.
public class bai08_replace {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, world!");
        System.out.println(stringBuffer.replace(5, 6, "-"));
    }
}
