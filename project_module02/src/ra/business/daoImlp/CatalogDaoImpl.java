package ra.business.daoImlp;

import ra.business.dao.ICatalogDao;
import ra.business.entity.Catalog;
import ra.business.entity.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CatalogDaoImpl implements ICatalogDao {
    public static List<Catalog> catalogs = new ArrayList<>();
    //    khởi tạo dữ liệu mẫu với khối static
    static {
        catalogs.add(new Catalog("Đồ gia dụng", "Xịn", LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách catalogs
        catalogs.add(new Catalog( "Ẩm thực", "Xịn", LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách catalogs
        catalogs.add(new Catalog("Thời trang", "Xịn", LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách catalogs
        catalogs.add(new Catalog("Đồ điện tử", "Xịn", LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách catalogs
    }
    @Override
    public List<Catalog> findAll() { // trả về tất cả các đối tượng danh mục
        return catalogs;
    }

    @Override
    public Catalog findById(Long id) { // tìm kiếm danh mục theo mã danh mục
        for (Catalog cat: catalogs) {
            if(cat.getCatalogId()==id){
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
        catalogs.set(catalogs.indexOf(findById(catalog.getCatalogId())), catalog);
    }

    @Override
    public void delete(Long id) {
        catalogs.remove(findById(id));
    }

    @Override
    public boolean checkExistsByName(String name) {
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}