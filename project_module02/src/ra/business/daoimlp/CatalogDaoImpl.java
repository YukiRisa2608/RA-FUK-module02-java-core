package ra.business.daoimpl;

import ra.business.dao.ICatalogDao;
import ra.business.entity.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogDaoImpl implements ICatalogDao {
    private static List<Catalog> catalogs = new ArrayList<>();
    //    khởi tạo dữ liệu mẫu với khối static
    static {
        catalogs.add(new Catalog()); // thêm mới 1 phần tử vào danh sách catalogs
        catalogs.add(new Catalog());
    }
    @Override
    public List<Catalog> findAll() { // trả về tất cả các đối tượng danh mục
        return catalogs;
    }

    @Override
    public Catalog findById(Long id) { // tìm kiếm danh mục theo mã danh mục
        for (Catalog cat: catalogs) {
            if(cat.getId()==id){
                return cat;
            }
        }
        return null;
    }

    @Override
    public void add(Catalog catalog) {
        catalogs.add(catalog);
    }

    @Override
    public void update(Catalog catalog) {
        catalogs.set(catalogs.indexOf(findById(catalog.getId())), catalog);
    }

    @Override
    public void delete(Long id) {
        catalogs.remove(findById(id));
    }
}