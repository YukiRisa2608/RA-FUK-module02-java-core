package bai15_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

////Viết một class StudentManagement với các phương thức sau:
////Phương thức show all hiển thị tất cả student trong chương trình.
////Phương thức void addStudent(Student student) để thêm một sinh viên vào danh sách sinh viên
////Phương thức void removeStudent(int studentId) để xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên.
////Phương thức Student findStudentById(int studentId) để tìm kiếm sinh viên có mã số sinh viên là studentId và trả về đối tượng Student tương ứng. Nếu không tìm thấy sinh viên nào thì hiển thị “không tìm thấy sinh viên” và trả về null.
////Phương thức getAverageScore tính và trả về điểm trung bình của tất cả student.
////Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần.
public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }
////Phương thức show all hiển thị tất cả student trong chương trình.
    public void showAll() {
        System.out.println(students.toString());
    }
////Phương thức void addStudent(Student student) để thêm một sinh viên vào danh sách sinh viên
    public void addStudent(Student student) {
        students.add(student);
    }
////Phương thức void removeStudent(int studentId) để xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên.
    public void removeStudent(int remoteId) {
        if (findStudentById(remoteId) != null) {
            students.remove(remoteId);
            System.out.println("Đã xóa sv có ID là: " + remoteId);
        } else {
            System.out.println("Không tìm thấy sv nào có ID là: " + remoteId);
        }
    }
////Phương thức Student findStudentById(int studentId) để tìm kiếm sinh viên có mã số sinh viên là studentId
// và trả về đối tượng Student tương ứng.
// Nếu không tìm thấy sinh viên nào thì hiển thị “không tìm thấy sinh viên” và trả về null.
    public Student findStudentById(int findId) {
        for (Student student : students) {
            if (student.getStudentId() == findId) {
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên");
        return null;
    }
////Phương thức getAverageScore tính và trả về điểm trung bình của tất cả student.
    double sum = 0;
    public double getAverageScore() {
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }
////Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần.
    public void sortByScore() {
            Collections.sort(students, (student1, student2) -> Double.compare(student1.getAverageScore(), student2.getAverageScore()));
    }
}
