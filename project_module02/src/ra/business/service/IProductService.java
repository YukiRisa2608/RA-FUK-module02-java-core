package ra.business.service;

import ra.business.entity.Catalog;
import ra.business.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllOrderByCreatedDate();
    List<Product> findProductByCategoryId(Long id);

    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteByProductId(Long id);
    Product findById(Long id);
    boolean checkExistByProductName(String productName);
    List<Product> searchByName(String name);
    List<Product> filtByStatus(boolean status);
    Long getNewId();

}
