package bai02_employee.ClassModalEmployee;

import java.util.List;

//Đối với nhân viên Intern có thêm thuộc tính: Chuyên ngành đang học (majors), Học
//kì đang học (semester), Tên trường đang học (universityName)
public class Intern extends Employee {
    private String major;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, String semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int id, String name, String birthDay, String phone, String email, String employeeType, List<Certificate> certificates, String major, String semester, String universityName) {
        super(id, name, birthDay, phone, email, employeeType, certificates);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return major;
    }

    public void setMajors(String majors) {
        this.major = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void addCertificate(Certificate certificate) {
        super.addCertificate(certificate);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.println("University name: " + universityName);
    }
}
