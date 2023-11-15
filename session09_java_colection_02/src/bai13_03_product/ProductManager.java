package bai13_03_product;

import java.util.ArrayList;

//Bước 2: Xây dựng lớp ProductManager gồm các phương thức thêm, sửa, xóa, hiển thị, tìm kiếm, sắp xếp.
//Trong lớp ProductManager khai báo ArrayList để lưu danh sách sản phẩm
public class ProductManager implements IProductManager<Product>{
    //khai bao
    private ArrayList<Product> productList;
    //khoi tao
    public ProductManager() {
        this.productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(int findId, Product updateProduct) {
        for (Product product : productList) {
            if (product.getId() == findId) {
                product.setProductName(updateProduct.getProductName());
                product.setPrice(updateProduct.getPrice());
                break;
            }
        }
    }

    @Override
    public boolean removeProduct(int findId) {
        int originalSize = productList.size();
        productList.removeIf(product -> product.getId() == findId);
        return productList.size() < originalSize;
    }

    @Override
    public void displayProducts() {
        productList.forEach(System.out::println);
    }

    @Override
    public Product searchProductByName(String findName) {
        for (Product product : productList) {
            if (product.getProductName().equals(findName)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void sortProductsByPrice(boolean ascending) {
        productList.sort((product1, product2) -> {
            if (ascending) { //true, tang
                return Double.compare(product1.getPrice(), product2.getPrice());
            } else { //false, giam
                return Double.compare(product2.getPrice(), product1.getPrice());
            }
        });
    }

    @Override
    public Product read(int findId) {
        for (Product product : productList) {
            if (product.getId() == findId) {
                return product;
            }
        }
        return null;
    }
}
