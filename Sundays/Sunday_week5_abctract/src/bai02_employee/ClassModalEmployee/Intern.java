package bai02_employee.ClassModalEmployee;

//Đối với nhân viên Intern có thêm thuộc tính: Chuyên ngành đang học (majors), Học
//kì đang học (semester), Tên trường đang học (universityName)
public class Intern extends Employee {
    private String major;
    private Enum.Semester semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, Enum.Semester semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int id, String name, String birthDay, String phone, String email, Enum.EmployeeType employeeType, String majors, Enum.Semester semester, String universityName) {
        super(id, name, birthDay, phone, email, employeeType);
        this.major = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return major;
    }

    public void setMajors(String majors) {
        this.major = majors;
    }

    public Enum.Semester getSemester() {
        return semester;
    }

    public void setSemester(Enum.Semester semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void addCertificates(int certificatedId, String certificatedName, String certificateRank, String certificateDate) {
        super.addCertificates(certificatedId, certificatedName, certificateRank, certificateDate);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.println("University name: " + universityName);
    }
}
