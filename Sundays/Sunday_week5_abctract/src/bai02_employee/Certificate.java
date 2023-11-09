package bai02_employee;

import java.util.Date;

//** Ngoài ra mỗi nhân viên khi vào làm cần phải nộp bằng cấp nghề nghiệp đi kèm, bộ phận
//tuyển dụng cần quản lý các bằng cấp này. Một nhân viên có thể có nhiều bằng cấp
//(Certificate)
//Với mỗi bằng cấp có các thông tin bao gồm : certificatedID, certificateName, certificateRank,certificatedDate.
public class Certificate {
    private int certificatedId;
    private String certificateName;
    private String certificateRank;
    private String certificateDate;

    public Certificate() {
    }

    public Certificate(int certificatedId, String certificateName, String certificateRank, String certificateDate) {
        this.certificatedId = certificatedId;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public int getCertificatedID() {
        return certificatedId;
    }

    public void setCertificatedID(int certificatedId) {
        this.certificatedId = certificatedId;
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

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }
}
