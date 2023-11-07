package bai02_employee;

import java.util.Date;

//** Ngoài ra mỗi nhân viên khi vào làm cần phải nộp bằng cấp nghề nghiệp đi kèm, bộ phận
//tuyển dụng cần quản lý các bằng cấp này. Một nhân viên có thể có nhiều bằng cấp
//(Certificate)
//Với mỗi bằng cấp có các thông tin bao gồm : certificatedID, certificateName, certificateRank,certificatedDate.
public class Certificate {
    private int certificatedID;
    private String certificateName;
    private String certificateRank;
    private Date certificateDate;

    public Certificate() {
    }

    public Certificate(int certificatedID, String certificateName, String certificateRank, Date certificateDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public int getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(int certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }
}
