package ra.business.dao;

import ra.business.entity.Product;

import java.util.List;

public interface IProductDao extends IGenericDao<Product,Long> {
    List<Product> findProductByCategoryId(Long id);
}