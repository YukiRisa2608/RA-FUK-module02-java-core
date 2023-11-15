package bai13_03_product;

public interface IProductManager <T>{
    void addProduct(T product);
    void updateProduct(int id, T product);
    boolean removeProduct(int id);
    void displayProducts();
    T searchProductByName(String name);
    void sortProductsByPrice(boolean ascending);
    T read (int id);
}
