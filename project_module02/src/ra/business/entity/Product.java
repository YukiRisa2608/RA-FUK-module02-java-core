package ra.business.entity;

import ra.business.daoImlp.CatalogDaoImpl;
import ra.business.daoImlp.ProductDaoImpl;
import ra.business.util.InputMethods;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Product implements Serializable {
    private Long productId;
    private String productName;
    private Long categoryId;
    private String description;
    private double unitPrice;
    private int stock;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean status;

    private static Long ID = ProductDaoImpl.getProducts().size() == 0 ? 1 : ProductDaoImpl.getProducts().get(ProductDaoImpl.getProducts().size() - 1).getProductId() + 1;

    public void input(Long categoryId){
        System.out.println("Enter name: ");
        this.productName = InputMethods.getString();

        this.categoryId = categoryId;

        System.out.println("Enter description: ");
        this.description = InputMethods.getString();

        System.out.println("Enter init price: ");
        this.unitPrice = InputMethods.getDouble();

        System.out.println("Enter stock: ");
        this.stock = InputMethods.getInteger();

        System.out.println("Enter status (true/false): ");
        this.status = InputMethods.getBoolean();
    }

    public Product(String productName, Long categoryId, String description, double unitPrice, int stock, LocalDateTime createdAt, LocalDateTime updatedAt, boolean status) {
        this.productId = ID++;
        this.productName = productName;
        this.categoryId = categoryId;
        this.description = description;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Product() {
        this.productId = ID++;
        this.createdAt = LocalDateTime.now();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

