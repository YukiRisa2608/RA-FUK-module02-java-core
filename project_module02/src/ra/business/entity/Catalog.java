package ra.business.entity;

import ra.business.daoImlp.CatalogDaoImpl;
import ra.business.util.InputMethods;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Catalog implements Serializable {
    private Long catalogId;

    private String catalogName;

    private String description;

    private LocalDateTime createdDate;

    private boolean status;


//    private static Long ID = CatalogDaoImpl.getCatalogs().size() == 0 ? 1 : CatalogDaoImpl.getCatalogs().get(CatalogDaoImpl.getCatalogs().size() - 1).getCatalogId() + 1;

    public void input(){
        System.out.println("Enter name of category: ");
        this.catalogName = InputMethods.getString();
        System.out.println("Enter description for category: ");
        this.description = InputMethods.getString();
        System.out.println("Enter status: Show (type true) or Hide(type false) ");
        this.status = InputMethods.getBoolean();
    }

    public Catalog(Long id, String catalogName, String description, LocalDateTime createdDate, boolean status) {
        this.catalogId = id;
        this.catalogName = catalogName;
        this.description = description;
        this.createdDate = createdDate;
        this.status = status;
    }

    public Catalog() {
        this.createdDate = LocalDateTime.now();
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", status=" + status +
                '}';
    }

}
