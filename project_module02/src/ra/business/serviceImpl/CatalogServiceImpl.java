package ra.business.serviceImpl;

import ra.business.dao.ICatalogDao;
import ra.business.daoImlp.CatalogDaoImpl;
import ra.business.entity.Catalog;
import ra.business.service.ICatalogService;

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
        catalogDao.add(catalog);
    }

    @Override
    public void updateCatalog(Catalog catalog) {
        catalogDao.update(catalog);
    }

    @Override
    public void deleteByCatalogId(Long id) {
        catalogDao.delete(id);
    }

    @Override
    public Catalog findById(Long id) {
        return catalogDao.findById(id);
    }

    @Override
    public boolean checkExistByCatalogName(String catalogName) {
        return catalogDao.checkExistsByName(catalogName);
    }
}
