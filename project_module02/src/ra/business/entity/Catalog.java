package ra.business.entity;

import ra.business.daoImlp.CatalogDaoImpl;
import ra.business.util.InputMethods;

import java.time.LocalDateTime;

public class Catalog {
    private Long catalogId;

    private String catalogName;

    private String description;

    private LocalDateTime createdDate;

    private boolean status;


    private static Long ID = CatalogDaoImpl.getCatalogs().size() == 0 ? 1 : CatalogDaoImpl.getCatalogs().get(CatalogDaoImpl.getCatalogs().size() - 1).getCatalogId() + 1;

    public void input(){
        System.out.println("Enter name: ");
        this.catalogName = InputMethods.getString();
        System.out.println("Enter description: ");
        this.description = InputMethods.getString();
        System.out.println("Enter status: ");
        this.status = InputMethods.getBoolean();
    }

    public Catalog(String catalogName, String description, LocalDateTime createdDate, boolean status) {
        this.catalogId = ID++;
        this.catalogName = catalogName;
        this.description = description;
        this.createdDate = createdDate;
        this.status = status;
    }

    public Catalog() {
        this.catalogId = ID++;
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
}
