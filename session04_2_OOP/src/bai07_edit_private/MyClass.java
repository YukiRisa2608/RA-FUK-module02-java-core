package bai07_edit_private;
//Trong bài này, chúng ta sẽ xây dựng 1 class tên là MyClass
// có 1 thuộc tính private tên là myString có kiểu dữ liệu là String,
// các constructor ,các phương thức setter và getter cho phép thay đổi và lấy ra giá trị các thuộc tính private.
public class MyClass {
    private String myString;

    public MyClass() {
    }
    public MyClass(String myString) {
        this.myString = myString;
    }
    public String getString() {
        return myString;
    }
    public void setString(String myString) {
        this.myString = myString;
    }
}
