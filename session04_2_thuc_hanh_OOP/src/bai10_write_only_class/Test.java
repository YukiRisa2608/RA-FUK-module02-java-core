package bai10_write_only_class;
//Hãy tạo lớp Test, tạo đối tượng  và truy cập đến các phương thức setName(name: String) và setClasses(classes: String).
//Thay đổi access modifier cho các phương thức setName(name: String) và setClasses(classes: String), sau đó test lại.
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nham");
        student.setClassName("RA FUK");
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClassName());
    }
}
