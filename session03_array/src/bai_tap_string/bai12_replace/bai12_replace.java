package bai_tap_string.bai12_replace;
//Đề bài:  Viết một chương trình Java để tìm kiếm và thay thế tất cả các từ trong chuỗi bắt đầu bằng chữ "s" thành chữ "t".
//Hướng dẫn: Sử dụng phương thức replace() được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
public class bai12_replace {
    public static void main(String[] args) {
        String str = "sasasasa";
        System.out.println(str.replace("s", "t"));
    }
}
