package bai13_03_product;

import java.util.Scanner;

public class ProductTest {
    private static ProductManager productList = new ProductManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        scanner.close();
    }

    private static void menu() {
        int choice = 0;
        do {
            System.out.println("___MENU___");
            System.out.println("1. Add new product");
            System.out.println("2. Update product by id");
            System.out.println("3. Delete product by id");
            System.out.println("4. Display products list");
            System.out.println("5. Search product by name");
            System.out.println("6. Sort products by price");
            System.out.println("7. Exit");
            System.out.println("_________________");

            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                updateProduct();
                break;
            case 3:
                removeProduct();
                break;
            case 4:
                displayProduct();
                break;
            case 5:
                searchProductByName();
                break;
            case 6:
                sortProductByPrice();
                break;
            case 7:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice, please try again!");
            }
        } while (choice != 7);
    }

    private static void sortProductByPrice() {
        System.out.println("Sort by price");
        System.out.println("1. ascending");
        System.out.println("2. descending");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                productList.sortProductsByPrice(true);
                System.out.println("Product list after ascending");
                displayProduct();
                break;
            case 2:
                productList.sortProductsByPrice(false);
                System.out.println("Product list after descending");
                displayProduct();
                break;
        }
    }

    private static void searchProductByName() {
        System.out.println("Enter product name to search: ");
        String searchName = scanner.nextLine();
        Product foundProduct = productList.searchProductByName(searchName);
        if (foundProduct != null) {
            System.out.println("Found product:");
            System.out.println(foundProduct);
        } else {
            System.out.println("Product not found");
        }

    }

    private static void displayProduct() {
        System.out.println("PRODUCT LIST");
        productList.displayProducts();
    }

    private static void removeProduct() {
        System.out.println("Enter ID to remove");
        int removeId = scanner.nextInt();
        scanner.nextLine();
        boolean removed = productList.removeProduct(removeId);
        if (removed) {
            System.out.println("Product removed successfully");
            System.out.println("Product list after removed");
            displayProduct();
        } else {
            System.out.println("Not found product");
        }
    }

    private static void updateProduct() {
        System.out.println("Enter update ID");
        int updateId = scanner.nextInt();
        scanner.nextLine();
        if (productList.read(updateId) == null) {
            System.out.println("ID " + updateId + " not found");
            return;
        } else {
            System.out.println("Current product details:");
            System.out.println(productList.read(updateId));

            System.out.println("Enter update name");
            String name = scanner.nextLine();

            System.out.println("Enter update price");
            double price = scanner.nextDouble();
            scanner.nextLine();

            productList.updateProduct(updateId, new Product(updateId, name, price));
            System.out.println("Updated successfully");
            System.out.println("Product list after update");
            displayProduct();
        }
    }

    private static void addProduct() {
        int inputId;
        boolean idExists;

        do {
            System.out.println("Enter product ID");
            inputId = scanner.nextInt();
            idExists = productList.read(inputId) != null;
            if (idExists) {
                System.out.println("ID " + inputId + " already exists! Enter other ID");
            }
        } while (idExists);

        scanner.nextLine();
        System.out.println("Enter product name");
        String productName = scanner.nextLine();

        System.out.println("Enter price");
        double price = scanner.nextDouble();
        scanner.nextLine();

        productList.addProduct(new Product(inputId, productName, price));
        System.out.println("Product added successfully");
        System.out.println("Product list after add:");
        displayProduct();
    }


}
