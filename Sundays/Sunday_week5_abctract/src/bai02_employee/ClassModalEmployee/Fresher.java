package bai02_employee.ClassModalEmployee;

import java.util.List;

//Đối với nhân viên Fresher có thêm thuộc tính: Thời gian tốt nghiệp(graduationDate),
//Xếp loại tốt nghiệp (graduationRank) , Trường tốt nghiệp (Education)
public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String graduateSchool;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String graduateSchool) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduateSchool = graduateSchool;
    }

    public Fresher(int id, String name, String birthDay, String phone, String email, String employeeType, List<Certificate> certificates, String graduationDate, String graduationRank, String graduateSchool) {
        super(id, name, birthDay, phone, email, employeeType, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduateSchool = graduateSchool;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Override
    public void addCertificate(Certificate certificate) {
        super.addCertificate(certificate);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation date: " + graduationDate);
        System.out.println("Graduation rank: " + graduationRank);
        System.out.println("Graduate school: " + graduateSchool);
    }
}
