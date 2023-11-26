package ra.business.service;

import ra.business.entity.Catalog;

import java.util.List;

public interface ICatalogService {
    List<Catalog> findAllOrderByCreatedDate();
    void createCatalog(Catalog catalog);
    void updateCatalog(Catalog catalog);
    void deleteByCatalogId(Long id);
    Catalog findById(Long id);
    boolean checkExistByCatalogName(String catalogName);
    List<Catalog> searchByName(String name);
}