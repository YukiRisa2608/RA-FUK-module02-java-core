package bai10_write_only_class;
//Hai thuộc tính có access modifier là private: name (string) có giá trị mặc định là "John", class (String) có giá trị mặc định là "C02".
//Một hàm tạo không có tham số.
//Hai phương thức có access modifier là public: setName và setClasses.

public class Student {
    private String name;
    private String className;

    public Student() {
        name = "John";
        className = "CO2";
    }
    public String getName() {
        return name;
    }
    public String getClassName() {
        return className;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClassName(String className) {
        this.className = className;
    }
}
