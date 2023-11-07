package bai02_employee;

import java.util.Date;

//Đối với nhân viên Fresher có thêm thuộc tính: Thời gian tốt nghiệp(graduationDate),
//Xếp loại tốt nghiệp (graduationRank) , Trường tốt nghiệp (Education)
public class Fresher extends Employee{
    private Date graduationDate;
    private Enum.GraduationRank graduationRank;
    private String graduateSchool;

    public Fresher() {
    }

    public Fresher(Date graduationDate, Enum.GraduationRank graduationRank, String graduateSchool) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduateSchool = graduateSchool;
    }

    public Fresher(int id, String name, java.sql.Date birthDay, int phone, String email, Enum.EmployeeType employeeType, Date graduationDate, Enum.GraduationRank graduationRank, String graduateSchool) {
        super(id, name, birthDay, phone, email, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduateSchool = graduateSchool;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public Enum.GraduationRank getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(Enum.GraduationRank graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Override
    public void addCertificates(Certificate certificate) {
        super.addCertificates(certificate);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation date: " + graduationDate);
        System.out.println("Graduation rank: " + graduationRank);
        System.out.println("Graduate school: " + graduateSchool);
    }
}
