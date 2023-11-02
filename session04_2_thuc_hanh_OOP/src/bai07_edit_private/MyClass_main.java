package bai07_edit_private;
//Bước 2 : Tạo lớp Main có phương thức main () ,
// trong phương thức main , hãy xây khởi tạo 1 đối tượng từ lớp MyClass, hiển thị giá trị thuộc tính myString của đối tượng vừa tạo.
//Bước 3: Thay đổi giá trị thuộc tính myString của đối tượng vừa tạo, sau đó hiển thị lại giá trị mới.
public class MyClass_main {
    public static void main(String[] args) {
       // khởi tạo 1 đối tượng từ lớp MyClass, hiển thị giá trị thuộc tính myString của đối tượng vừa tạo.
        MyClass myClass = new MyClass("This is original string");
        System.out.println("Original string: " + myClass.getString());
        //Thay đổi giá trị thuộc tính myString của đối tượng vừa tạo, sau đó hiển thị lại giá trị mới.
        myClass.setString("This is new string");
        System.out.println("New string: " + myClass.getString());
    }
}
