package ra.business.daoImlp;

import ra.business.dao.IProductDao;
import ra.business.entity.Catalog;
import ra.business.entity.Product;
import ra.business.util.IOFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements IProductDao {
    private static List<Product> products = new ArrayList<>();

    //    khởi tạo dữ liệu mẫu với khối static
    static {
//        products.add(new Product("Noi com dien", 1L, "Sản phẩm ok", 100, 120, LocalDateTime.now(), LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách
//        products.add(new Product("banh", 2L, "Sản phẩm ok", 100, 120, LocalDateTime.now(), LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách
//        products.add(new Product("thijt bo", 2L, "Sản phẩm ok", 100, 120, LocalDateTime.now(), LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách
//        products.add(new Product("Tom hum", 2L, "Sản phẩm ok", 100, 120, LocalDateTime.now(), LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách
//        products.add(new Product("Noi ap suat", 1L, "Sản phẩm ok", 100, 120, LocalDateTime.now(), LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách
//        products.add(new Product("Dao thai", 1L, "Sản phẩm ok", 100, 120, LocalDateTime.now(), LocalDateTime.now(), true)); // thêm mới 1 phần tử vào danh sách
        products = IOFile.getListFromFile(IOFile.PRODUCT_PATH);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        for (Product p : products) {
            if (p.getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void add(Product product) {
        products.add(product);
        IOFile.writeToFile(IOFile.PRODUCT_PATH, products);
    }

    @Override
    public void update(Product product) {
//        int index = this.findIndexProduct(product.getProductId());
//        if (index == -1){
//            System.out.println("Khong tim thay product co id: " + product.getProductId());
//            return;
//        }
//        products.set(index, product);
        IOFile.writeToFile(IOFile.PRODUCT_PATH, products);
    }

    @Override
    public void delete(Long id) {
        products.remove(findById(id));
        IOFile.writeToFile(IOFile.PRODUCT_PATH, products);
    }

    public int findIndexProduct(Long id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId().equals(id)){
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean checkExistsByName(String name) {
        for (Product product : products) {
            if (product.getProductName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product: products){
            if (product.getProductName().toLowerCase().contains(name.toLowerCase())){
                productList.add(product);
            }
        }
        return productList;
    }

    @Override
    public List<Product> findProductByCategoryId(Long id) {
        List<Product> productList = new ArrayList<>();
        for (Product product: products){
            if (product.getCategoryId().equals(id)){
                productList.add(product);
            }
        }
        return productList;
    }

    public static List<Product> getProducts() {
        return products;
    }

    @Override
    public List<Product> filtByStatus(boolean status) {
        List<Product> productList = new ArrayList<>();
        for (Product product: products){
            if (product.isStatus() == status){
                productList.add(product);
            }
        }
        return productList;
    }
}
