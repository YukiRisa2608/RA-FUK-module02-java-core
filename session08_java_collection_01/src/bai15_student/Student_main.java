package bai15_student;

public class Student_main {
    public static void main(String[] args) {
        //Tạo list chứa dssv
        StudentManagement studentManagement = new StudentManagement();
        //Tạo sv mới
        Student student1 = new Student(1, "A", 8);
        Student student2 = new Student(2, "B", 9);
        Student student3 = new Student(3, "C", 10);
        //Thêm sv vào dssv
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);
        //Show student
        studentManagement.showAll();
        //Remove student
        studentManagement.removeStudent(1);
        //Find students
        Student findStudent = studentManagement.findStudentById(3);
        System.out.println("Đã tìm thấy sv: " + findStudent);
        //Average score
        double average = studentManagement.getAverageScore();
        System.out.println("Average: " + average);
        //Sort students
        studentManagement.sortByScore();
        System.out.println("After sort: ");
        studentManagement.showAll();
    }
}
