package Hotel.chua_bai;

public class Customer {

    private String name;
    private int age;
    private String identifierNumber;

    public Customer() {

    }

    public Customer(String name, int age, String identifierNumber) {
        this.name = name;
        this.age = age;
        this.identifierNumber = identifierNumber;
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


    public String getIdentifierNumber() {
        return identifierNumber;
    }


    public void setIdentifierNumber(String identifierNumber) {
        this.identifierNumber = identifierNumber;
    }




    public String toString() {
        return  String.format(
                "   Name %s:" + "\n" +
                        "   age: %s" + "\n" +
                        "   identifier: %s" + "\n", name, age, identifierNumber);
    }
}
