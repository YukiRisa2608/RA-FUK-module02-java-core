package ra.run;

import ra.business.entity.Catalog;
import ra.business.entity.Product;
import ra.business.service.ICatalogService;
import ra.business.service.IProductService;
import ra.business.serviceImpl.CatalogServiceImpl;
import ra.business.serviceImpl.ProductServiceImpl;
import ra.business.util.Formatter;
import ra.business.util.InputMethods;

import java.util.List;

public class StoreManangement {
    private static ICatalogService catalogService = new CatalogServiceImpl();
    private static IProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        // chạy chương trình

        // b1 điều hướng menu :
        // công nghệ sử dụng
        // do while để duy trì ứng dụng
        // switch case để điều hướng chức năng do người dùng nhập vào
        // I/O data


        // hiển thị menu chức năng
        do {
            System.out.println("--------- Menu chức năng ----------");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lí sản phẩm");
            System.out.println("0. Thoát chương trình");

            // yêu cầu nhập lựa chọn
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // điều hướng menu Quản lí dnah mục
                    menuCatalog();
                    break;
                case 2:
                    // điều hướng menu Quản lí sản phẩm
                    menuProduct();
                    break;
                case 0:
                    // thoát
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        } while (true);

    }

    // xử li các chức năng của danh mục
    public static void menuCatalog() {
        byte choice;
        do {
            System.out.println("=== MENU CATALOG ===");
            System.out.println("1. Show Catalogs");
            System.out.println("2. Add Catalog");
            System.out.println("3. Update Catalog");
            System.out.println("4. Delete Catalog");
            System.out.println("5. Search by catelog name");
            System.out.println("6. Show/Hide catalog");
            System.out.println("0. Exit");

            System.out.println("Hãy nhập vào lựa chọn");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    List<Catalog> catalogs = catalogService.findAllOrderByCreatedDate();
                    displayCatalog(catalogs);
                    break;
                case 2:
                    addCatalog();
                    break;
                case 3:
                    updateCatalog();
                    break;
                case 4:
                    deleteCatalog();
                    break;
                case 5:
                    searchCatalogsByName();
                case 6:
                    showOrHideCatalogById();
                case 0:
                    break;
                default:
                    System.out.println("invalid choice!!");
                    break;
            }
        } while (choice != 0);
    }

    // xử lí các chức năng của sản phẩm
    public static void menuProduct() {
        byte choice;
        do {
            System.out.println("=== MENU PRODUCTS ===");
            System.out.println("1. Show products");
            System.out.println("2. Show products by category");
            System.out.println("3. Add Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("0. Exit");
            System.out.println("Hãy nhập vào lựa chọn");
            choice = InputMethods.getByte();

            switch (choice) {
                case 1:
                    List<Product> products = productService.findAllOrderByCreatedDate();
                    displayProduct(products);
                    break;
                case 2:
                    showProductByCategory();
                    break;
                case 3:
                    addProduct();

                case 0:
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        } while (choice != 0);
    }


    //chuwsc nawng cua product
    private static void showProductByCategory() {
        System.out.println("=== CATEGORIES ===");
        List<Catalog> catalogs = catalogService.findAllOrderByCreatedDate();
        displayCatalog(catalogs);

        System.out.println("Enter Category ID: ");
        long category_id = InputMethods.getLong();
        List<Product> products = productService.findProductByCategoryId(category_id);
        displayProduct(products);
    }

    public static void displayProduct(List<Product> products) {
        System.out.printf("%-10s%-20s%-15s%-20s%-20s%-10s%-25s%-25s%-20s\n", "ID", "Product Name", "Category ID", "Description", "Unit Price", "Stock", "CreatedAt", "UpdatedAt", "Status");
        products.forEach(pro -> {
            if (pro.isStatus())
                System.out.printf("%-10s%-20s%-15s%-20s%-20s%-10s%-25s%-25s%-20s\n", pro.getProductId() + "", pro.getProductName(), pro.getCategoryId(), pro.getDescription(), Formatter.getNumberFormatterVND(pro.getUnitPrice()), pro.getStock() + "", pro.getCreatedAt() + "", pro.getUpdatedAt(), pro.isStatus() ? "Đang bán" : "Ngừng bán");
        });
    }

    private static void addProduct() {
        Long catalog_id;
        Catalog catalogChoice;
        do {
            System.out.println("=== CHỌN CATEGORY ===");
            displayCatalog(catalogService.findAllOrderByCreatedDate());
            System.out.println("Nhap id catalog: ");
            catalog_id = InputMethods.getLong();
            catalogChoice = catalogService.findById(catalog_id);
            if (catalogChoice == null) {
                System.out.println("Catalog không hợp lệ, hãy nhập lại!");
            }
        } while (catalogChoice == null);

        byte n;
        System.out.println("Nhap so luong san pham: ");
        n = InputMethods.getByte();
        for (int i = 0; i < n; i++) {
            System.out.println("=== THEM SAN PHAM THU " + (i+1) + " ===");
            Product product = new Product();
            product.input(catalogChoice.getCatalogId());
            productService.createProduct(product);
        }
    }


    // chức năng hiển tị danh mục
    public static void displayCatalog(List<Catalog> catalogs) {
        System.out.printf("%-10s%-20s%-20s%-20s\n", "ID", "Catelog Name", "Description", "CreatedAt");
        catalogs.forEach(cat -> {
            if (cat.isStatus())
                System.out.printf("%-10s%-20s%-20s%-20s\n", cat.getCatalogId() + "", cat.getCatalogName(), cat.getDescription(), cat.getCreatedDate() + "");
        });
    }

    private static void addCatalog() {
        Catalog catalog = new Catalog();
        catalog.input();
        catalogService.createCatalog(catalog);
    }

    private static void updateCatalog() {
        System.out.println("Enter id catalog update: ");
        long idUpdate = InputMethods.getLong();
        Catalog catalogUpdate = catalogService.findById(idUpdate);
        if (catalogUpdate == null) {
            System.out.println("Not found catalog");
        } else {
            String name;
            do {
                System.out.println("Enter catalog name update: ");
                name = InputMethods.getString();
                boolean isDuplicateName = catalogService.checkExistByCatalogName(name);
                if (isDuplicateName) {
                    System.out.println("Duplicate name");
                } else {
                    break;
                }
            } while (true);
            catalogUpdate.setCatalogName(name);
            System.out.println("Enter catalog des update: ");
            catalogUpdate.setDescription(InputMethods.getString());
            catalogService.updateCatalog(catalogUpdate);
        }
    }

    private static void deleteCatalog() {
        System.out.println("Enter id catalog delete: ");
        long idUpdate = InputMethods.getLong();
        Catalog catalogUpdate = catalogService.findById(idUpdate);
        if (catalogUpdate == null) {
            System.out.println("Not found catalog");
        } else {
            catalogService.deleteByCatalogId(idUpdate);
        }
    }

    private static void searchCatalogsByName() {
        System.out.println("Enter name: ");
        String name = InputMethods.getString();
        displayCatalog(catalogService.searchByName(name));
    }

    private static void showOrHideCatalogById() {
        System.out.println("Enter id catalog update: ");
        long idUpdate = InputMethods.getLong();
        Catalog catalogUpdate = catalogService.findById(idUpdate);
        if (catalogUpdate == null) {
            System.out.println("Not found catalog");
        } else {
            System.out.println("Show (type true) or Hide(type false) Catalog: ");
            catalogUpdate.setStatus(InputMethods.getBoolean());
            catalogService.updateCatalog(catalogUpdate);
        }
    }
}
