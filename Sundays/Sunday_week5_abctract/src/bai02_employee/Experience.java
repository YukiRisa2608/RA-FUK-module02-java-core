package bai02_employee;

import java.sql.Date;

//Đối với nhân viên Experience có thêm thuộc tính: Số năm kinh nghiệm (expInYear),
//Kỹ năng chuyên môn (ProSkill)
public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(int id, String name, String birthDay, String phone, String email, Enum.EmployeeType employeeType, int expInYear, String proSkill) {
        super(id, name, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void addCertificates(int certificatedId, String certificatedName, String certificateRank, String certificateDate) {
        super.addCertificates(certificatedId, certificatedName, certificateRank, certificateDate);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Experience years: " + expInYear);
        System.out.println("Pro Skill: " + proSkill);
    }
}
