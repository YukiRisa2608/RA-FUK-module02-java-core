package bai01_vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Yêu cầu 2: Xây dựng lớp QLPTGT có các chức năng:
//Thêm, xoá(theo ID) các phương tiện thuộc các loại trên.
//Thêm chức năng sort các xe theo giá bán
//Tìm phương tiện theo hãng sản xuất, màu.
//Thoát chương trình.
public class VehicleManagement {
    private static List<Vehicle> vehicleList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("---MENU---");
            System.out.println("1. Add a vehicle");
            System.out.println("2. Remove a vehicle by ID");
            System.out.println("3. Sort vehicle by price");
            System.out.println("4. Find vehicle by manufacturer");
            System.out.println("5. Find vehicle by color");
            System.out.println("6. Display all vehicle");
            System.out.println("7. Exit");
            System.out.println("Enter your choice");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    removeVehicleById();
                    break;
                case 3:
                    sortVehicleByPrice();
                    break;
                case 4:
                    findVehicleByManufacturer(scanner);
                    break;
                case 5:
                    findVehicleByColor(scanner);
                    break;
                case 6:
                    displayAllVehicle(vehicleList);
                    break;
                case 7:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Unknown, please try again!");
            }
        } while (choice != 7);
        scanner.close();
    }

    private static void displayAllVehicle(List<Vehicle> vehicles) {
        System.out.println("___Vehicle list___");
            if (vehicles.isEmpty()) {
                System.out.println("Vehicle list is empty");
            } else {
                for (Vehicle vehicle : vehicles) {
                    System.out.println();
                    vehicle.displayDetails();
                }
            }
    }

    // Find by color
    private static void findVehicleByColor(Scanner scanner) {
        System.out.println("Enter vehicle color to search");
        String findColor = scanner.nextLine();
        List<Vehicle> foundVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.color.equalsIgnoreCase(findColor)) {
                foundVehicles.add(vehicle);
            }
        }
        printResults(foundVehicles);
    }
//Find by manufacturer
    private static void findVehicleByManufacturer(Scanner scanner) {
        System.out.println("Enter manufacturer to search");
        String findByManufacturer = scanner.nextLine();
        List<Vehicle> foundVehicles = new ArrayList<>();
        for(Vehicle vehicle : vehicleList) {
            if(vehicle.manufacturer.equalsIgnoreCase(findByManufacturer)) {
                foundVehicles.add(vehicle);
            }
        }
        printResults(foundVehicles);
    }
//Display results
    public static void printResults(List<Vehicle> foundResultsList) {
        if (foundResultsList.isEmpty()) {
            System.out.println("No vehicle matching");
        } else {
            System.out.println("Found list:");
            for(Vehicle foundVehicle : foundResultsList) {
                foundVehicle.displayDetails();
            }
        }
    }

//Sort
    private static void sortVehicleByPrice() {
        vehicleList.sort(Comparator.comparingDouble(vehicle -> vehicle.price));
        System.out.println("Vehicle list after sorted:");
        for(Vehicle vehicle : vehicleList) {
            System.out.println();
            vehicle.displayDetails();
        }
    }
//Remove vehicle
    private static void removeVehicleById() {
        System.out.println("Enter ID to remove");
        int removeId = scanner.nextInt();
        scanner.nextLine();
        int originalSize = vehicleList.size();
        vehicleList.removeIf(vehicle -> vehicle.id == removeId);
        if (vehicleList.size() < originalSize) {
        System.out.println("Removed ID " + removeId + " successfully");
        } else {
            System.out.println("Not found ID " + removeId);
        }
    }
//Add vehicle
    private static void addVehicle() {
        System.out.println("Input details to add");
        System.out.println("Choose type of vehicle");
        System.out.println("1.Car, 2.Motorbike, 3.Truck");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter ID" + id);

        System.out.println("Input manufacturer");
        String manufacturer = scanner.nextLine();

        System.out.println("Input year");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input price");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input color");
        String color = scanner.nextLine();

        Vehicle vehicle;
        switch (type) {
            case 1: //Car
                System.out.println("Input seat number");
                int seatNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Input engine type");
                String engineType = scanner.nextLine();

                vehicle = new Car(id, manufacturer, year, price, color, seatNumber, engineType);
                break;
            case 2://Motorbike
                System.out.println("Enter power");
                int power = scanner.nextInt();
                scanner.nextLine();

                vehicle = new Motorbike(id, manufacturer, year, price, color, power);
                break;
            case 3://Truck
                System.out.println("Enter payload");
                double payload = scanner.nextDouble();
                scanner.nextLine();

                vehicle = new Truck(id, manufacturer, year, price, color, payload);
                break;
            default:
                System.out.println("Unknown, try again");
                return;
        }
        vehicleList.add(vehicle);
        System.out.println("Added successfully");
    }
}
