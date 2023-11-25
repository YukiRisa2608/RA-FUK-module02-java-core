package ra.business.serviceimpl;

import ra.business.dao.ICatalogDao;
import ra.business.daoimpl.CatalogDaoImpl;
import ra.business.entity.Catalog;
import ra.business.service.ICatalogService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogServiceImpl implements ICatalogService {
    private static ICatalogDao catalogDao = new CatalogDaoImpl();
    @Override
    public List<Catalog> findAllOrderByCreatedDate() {
        return catalogDao.findAll().stream()
                .sorted((c1,c2)->c2.getCreatedDate().compareTo(c1.getCreatedDate()))
                .collect(Collectors.toList());
    }

    @Override
    public void createCatalog(Catalog catalog) {

    }

    @Override
    public void updateCatalog(Catalog catalog) {

    }

    @Override
    public void deleteByCatalogId(Long id) {

    }

    @Override
    public Catalog findById(Long id) {
        return null;
    }

    @Override
    public boolean checkExistByCatalogName(String catalogName) {
        return false;
    }
}
