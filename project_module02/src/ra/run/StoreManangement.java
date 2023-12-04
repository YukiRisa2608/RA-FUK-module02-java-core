package ra.run;

import ra.business.entity.Catalog;
import ra.business.entity.Product;
import ra.business.service.ICatalogService;
import ra.business.service.IProductService;
import ra.business.serviceImpl.CatalogServiceImpl;
import ra.business.serviceImpl.ProductServiceImpl;
import ra.business.util.Formatter;
import ra.business.util.InputMethods;

import java.time.LocalDateTime;
import java.util.List;

public class StoreManangement {
    private static ICatalogService catalogService = new CatalogServiceImpl();
    private static IProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        // chạy chương trình

        // hiển thị menu chức năng
        home();

    }
//******************************HOME MENU***********************************
    private static void home() {
        do {
            System.out.println("\u001B[31;46m=== HOME MENU ===\u001B[0m");
            System.out.println("1. Category Management");
            System.out.println("2. Product Management");
            System.out.println("0. Exit");

            // yêu cầu nhập lựa chọn
            System.out.println("Enter your selection:");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // điều hướng menu Quản lí danh mục
                    menuCatalog();
                    break;
                case 2:
                    // điều hướng menu Quản lí sản phẩm
                    menuProduct();
                    break;
                case 0:
                    // thoát
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid choice, try again !");
                    break;
            }
        } while (true);
    }

    //***********MENU CATALOG*******************************

    public static void menuCatalog() {
        byte choice;
        do {
            System.out.println("\u001B[31;46m=== CATALOG MENU ===\u001B[0m");
            System.out.println("1. Show Catalogs");
            System.out.println("2. Add New Catalog");
            System.out.println("3. Update Catalog by ID");
            System.out.println("4. Delete Catalog by ID");
            System.out.println("5. Search by category name");
            System.out.println("6. Show/Hide catalog");
            System.out.println("7. Home menu");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:");
            choice = InputMethods.getByte();
            switch (choice) {
                case 1: //Show Catalogs
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
                    break;
                case 6:
                    showOrHideCatalogById();
                    break;
                case 7:
                    home();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("invalid choice!! Try again");
                    break;
            }
        } while (choice != 0);
    }


//*********************MENU PRODUCT**************************************************************

    public static void menuProduct() {
        byte choice;
        do {
            System.out.println("\u001B[31;46m=== PRODUCT MENU ===\u001B[0m");
            System.out.println("1. Show all products");
            System.out.println("2. Show products by category");
            System.out.println("3. Add Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Update Status");
            System.out.println("7. Search By Product Name");
            System.out.println("8. Filter by status");
            System.out.println("9. Home menu");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");

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
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    updateStatus();
                    break;
                case 7:
                    searchByProductName();
                    break;
                case 8:
                    filtByStatus();
                    break;
                case 9:
                    home();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("invalid choice!! Try again.");
                    break;
            }
        } while (choice != 0);
    }


//**************PRODUCT FUNCTIONS*****************************************

    //Show product by category
    private static void showProductByCategory() {
        System.out.println("=== CATEGORIES ===");
        List<Catalog> catalogs = catalogService.findAllOrderByCreatedDate();
        displayCatalog(catalogs);

        System.out.println("Enter Category ID to show products: ");
        long category_id = InputMethods.getLong();
        List<Product> products = productService.findProductByCategoryId(category_id);
        displayProduct(products);
    }

    //Show all products
    public static void displayProduct(List<Product> products) {
        if (products == null || products.size() == 0){
            System.err.println("---Not found any product!!!---");
            return;
        }
        System.err.printf("%-10s%-20s%-15s%-20s%-20s%-10s%-25s%-25s%-20s\n", "ID", "PRODUCT NAME", "CATEGORY ID", "DESCRIPTION", "UNIT PRICE", "STOCK", "CREAT AT", "UPDATE AT", "STATUS");
        products.forEach(pro -> {
            System.out.printf("%-10s%-20s%-15s%-20s%-20s%-10s%-25s%-25s%-20s\n", pro.getProductId() + "", pro.getProductName(), pro.getCategoryId(), pro.getDescription(), Formatter.getNumberFormatterVND(pro.getUnitPrice()), pro.getStock() + "", pro.getCreatedAt() + "", pro.getUpdatedAt(), pro.isStatus() ? "\u001B[32mAvailable\u001B[0m" : "\u001B[31mNot Available\u001B[0m");
        });
    }

    //Add product
    private static void addProduct() {
        Long catalog_id;
        Catalog catalogChoice;
        do {
            System.out.println("\u001B[32m=== SELECT CATEGORY TO ADD===\u001B[0m");
            displayCatalog(catalogService.findAllOrderByCreatedDate());
            System.out.println("Enter category ID you want to add product: ");
            catalog_id = InputMethods.getLong();
            catalogChoice = catalogService.findById(catalog_id);
            if (catalogChoice == null) {
                System.err.println("---Not found catagory ID: " + catalog_id + " . Please try again!!---");
            }
        } while (catalogChoice == null);

        byte n;
        System.out.println("Enter the quantity of products you want to add: ");
        n = InputMethods.getByte();
        for (int i = 0; i < n; i++) {
            System.out.println("=== \u001B[32mEnter information for product number\u001B[0m " + (i + 1) + " ===");
            Product product = new Product();
            product.input(catalogChoice.getCatalogId());
            product.setProductId(productService.getNewId());
            productService.createProduct(product);
        }
    }

    //Update product
    private static void updateProduct() {
        System.out.println("Enter ID of product to update: ");
        long idUpdate = InputMethods.getLong();
        Product productUpdate = productService.findById(idUpdate);
        if (productUpdate == null) {
            System.err.println("Not found product, try again.");
        } else {
            //update name
            String name;
            do {
                System.out.println("Enter product name to update: ");
                name = InputMethods.getString();
                boolean isDuplicateName = productService.checkExistByProductName(name);
                if (isDuplicateName) {
                    System.err.println("Duplicate name, try with an other name");
                } else {
                    break;
                }
            } while (true);
            productUpdate.setProductName(name);

            //update category id
            Long catalog_id;
            Catalog catalogChoice;
            do {
                System.out.println("\u001B[32m=== SELECT CATEGORY TO UPDATE===\u001B[0m");
                displayCatalog(catalogService.findAllOrderByCreatedDate());
                System.out.println("Enter category ID you want to update: ");
                catalog_id = InputMethods.getLong();
                catalogChoice = catalogService.findById(catalog_id);
                if (catalogChoice == null) {
                    System.err.println("Not found category with ID: " + catalog_id + ", try again!");
                }
            } while (catalogChoice == null);

            productUpdate.setCategoryId(catalog_id);

            //update description
            System.out.println("Enter description of product to update: ");
            productUpdate.setDescription(InputMethods.getString());

            //update unit price
            System.out.println("Enter unit price: ");
            productUpdate.setUnitPrice(InputMethods.getDouble());

            //update stock
            System.out.println("Enter stock: ");
            productUpdate.setStock(InputMethods.getInteger());

            //update updated_at
            productUpdate.setUpdatedAt(LocalDateTime.now());

            productService.updateProduct(productUpdate);
            System.out.println("\u001B[32m--- Successfully update category---\u001B[0m");
        }
    }

    //Delete Product
    private static void deleteProduct() {
        System.out.println("Enter ID of product to delete: ");
        long idDelete = InputMethods.getLong();
        Product productDelete = productService.findById(idDelete);
        if (productDelete == null) {
            System.err.println("Not found product with ID: " + idDelete);
        } else {
            productService.deleteByProductId(idDelete);
            System.out.println("\u001B[32m--- Successfully deleted category---\u001B[0m");
        }
    }

    //Update status: available/ not available
    private static void updateStatus() {
        System.out.println("Enter ID of product to change status: ");
        long idUpdate = InputMethods.getLong();
        Product productUpdate = productService.findById(idUpdate);
        if (productUpdate == null) {
            System.err.println("Not found product with id " + idUpdate);
        } else {
            System.out.println("Available (type true) or Not available(type false) Product: ");
            productUpdate.setStatus(InputMethods.getBoolean());
            productService.updateProduct(productUpdate);
            System.out.println("\u001B[32mChange Status Successfully!!!\u001B[0m");
        }
    }

    //Search product by name
    private static void searchByProductName() {
        System.out.println("Enter name of product you want to search: ");
        String name = InputMethods.getString();
//        System.out.println("===FOUND LIST===");
        displayProduct(productService.searchByName(name));
    }

    //Filter display product by status
    private static void filtByStatus() {
        byte statusChoice;
        do{
            System.out.println("\u001B[32m=== FILTER ===\u001B[0m");
            System.out.println("1. Show Available Products");
            System.out.println("2. Show Not Available Products");
            System.out.println("Enter your choice:");
            statusChoice = InputMethods.getByte();
        } while(statusChoice != 1 && statusChoice != 2);

        if (statusChoice == 1){
            displayProduct(productService.filtByStatus(true));
        }else {
            displayProduct(productService.filtByStatus(false));
        }
    }

 //*******************CATEGORY FUNCTIONS************************************************************************

    // Show all category
    public static void displayCatalog(List<Catalog> catalogs) {
        if (catalogs == null || catalogs.size() == 0){ //catalogs.isEmpty()
            System.err.println("Not found any catalogs!");
            return;
        }
        System.err.printf("%-10s%-20s%-20s%-20s\n", "ID", "CATEGORY NAME", "DESCRIPTION", "CREAT AT");
        catalogs.forEach(cat -> {
            if (cat.isStatus())
                System.out.printf("%-10s%-20s%-20s%-20s\n", cat.getCatalogId() + "", cat.getCatalogName(), cat.getDescription(), cat.getCreatedDate() + "");
        });
    }

    //Add category
    private static void addCatalog() {
        Catalog catalog = new Catalog();
        catalog.input();
        catalog.setCatalogId(catalogService.getNewId());
        catalogService.createCatalog(catalog);
    }

    //Update category
    private static void updateCatalog() {
        System.out.println("Enter ID of category to update: ");
        long idUpdate = InputMethods.getLong();
        Catalog catalogUpdate = catalogService.findById(idUpdate);
        if (catalogUpdate == null) {
            System.err.println("Not found any category, try again!");
        } else {
            String name;
            do {
                System.out.println("Enter category name to update: ");
                name = InputMethods.getString();
                boolean isDuplicateName = catalogService.checkExistByCatalogName(name);
                if (isDuplicateName) {
                    System.err.println("Duplicate name, try with an other name:");
                } else {
                    break;
                }
            } while (true);
            catalogUpdate.setCatalogName(name);
            System.out.println("Enter description of category to update: ");
            catalogUpdate.setDescription(InputMethods.getString());
            catalogService.updateCatalog(catalogUpdate);
            System.out.println("\u001B[32m--- Successfully update category---\u001B[0m");
        }
    }

    //Delete catalog by id
    private static void deleteCatalog() {
        System.out.println("Enter ID of catalog to delete: ");
        long idDelete = InputMethods.getLong();
        Catalog catalogDelete = catalogService.findById(idDelete);
        if (catalogDelete == null) {
            System.err.println("Not found category with ID " + idDelete);
        } else {
            catalogService.deleteByCatalogId(idDelete);
            System.out.println("\u001B[32m--- Successfully deleted category---\u001B[0m");
        }
    }

    //Search category by name
    private static void searchCatalogsByName() {
        System.out.println("Enter name of category you want to search: ");
        String name = InputMethods.getString();
//        System.out.println("===FOUND LIST===");
        displayCatalog(catalogService.searchByName(name));
    }

    //Edit status: Show or hide category by id
    private static void showOrHideCatalogById() {
        System.out.println("Enter ID of category to show or hide: ");
        long idUpdate = InputMethods.getLong();
        Catalog catalogUpdate = catalogService.findById(idUpdate);
        if (catalogUpdate == null) {
            System.err.println("Not found category with id " + idUpdate);
        } else {
            System.out.println("Show (type true) or Hide(type false) Catalog: ");
            catalogUpdate.setStatus(InputMethods.getBoolean());
            catalogService.updateCatalog(catalogUpdate);
            System.out.println("\u001B[32m---Change Status Successfully!!!---\u001B[0m");
        }
    }
}
