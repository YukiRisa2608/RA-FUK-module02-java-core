package ra.business.service;

import ra.business.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllOrderByCreatedDate();
    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteByProductId(Long id);
    Product findById(Long id);
    boolean checkExistByProductName(String productName);
}
