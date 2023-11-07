package Hotel.tu_lam;
//Yêu cầu 1: Hãy xây dựng lớp Customer để quản lý thông tin cá nhân của những người thuê phòng
//Với mỗi cá nhân cần quản lý các thông tin sau: Họ tên, tuổi, số chứng minh nhân dân.
public class Customer {
    private String name;
    private int age, cmnd;

    public Customer() {
    }

    public Customer(String name, int age, int cmnd) {
        this.name = name;
        this.age = age;
        this.cmnd = cmnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cmnd=" + cmnd +
                '}';
    }
}
