package ra.business.serviceImpl;

import ra.business.dao.ICatalogDao;
import ra.business.dao.IProductDao;
import ra.business.daoImlp.CatalogDaoImpl;
import ra.business.daoImlp.ProductDaoImpl;
import ra.business.entity.Catalog;
import ra.business.entity.Product;
import ra.business.service.IProductService;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements IProductService {
    private static IProductDao productDao = new ProductDaoImpl();
    @Override
    public List<Product> findAllOrderByCreatedDate() {
        return productDao.findAll().stream()
                .sorted((c1,c2)->c2.getCreatedAt().compareTo(c1.getCreatedAt()))
                .collect(Collectors.toList());
    }

    @Override
    public void createProduct(Product product) {
        if (this.checkExistByProductName(product.getProductName())) {
            System.err.println("Duplicate product name!");
            return;
        }
        productDao.add(product);
        System.out.println("\u001B[32m--- Successfully added product---\u001B[0m");
    }

    @Override
    public void updateProduct(Product product) {
//        if (this.checkExistByProductName(product.getProductName())) {
//            System.out.println("Teen san pham da ton tai");
//            return;
//        }
        productDao.update(product);
    }

    @Override
    public void deleteByProductId(Long id) {
        productDao.delete(id);
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public boolean checkExistByProductName(String productName) {
        return productDao.checkExistsByName(productName);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productDao.searchByName(name);
    }

    @Override
    public List<Product> findProductByCategoryId(Long id) {
        return productDao.findProductByCategoryId(id);
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L;
        for (Product p: productDao.findAll()) {
            if(idMax<p.getProductId()){
                idMax = p.getProductId();
            }
        }
        return idMax+1;
    }

    @Override
    public List<Product> filtByStatus(boolean status) {
        return productDao.filtByStatus(status);
    }
}
