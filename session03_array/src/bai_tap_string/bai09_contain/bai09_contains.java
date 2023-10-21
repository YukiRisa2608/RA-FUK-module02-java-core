package bai_tap_string.bai09_contain;
//Đề bài: Viết một chương trình Java để kiểm tra xem một chuỗi có chứa một chuỗi con khác hay không,
// sử dụng phương thức contains() của String.
public class bai09_contains {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "world";
        boolean isContains = str1.contains(str2);
        if (isContains) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
