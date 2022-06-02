package baitap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    LinkedList<Product> products = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Add product");
        System.out.println("2. Edit product information by ID");
        System.out.println("3. Delete product by ID");
        System.out.println("4. Show product list");
        System.out.println("5. Search product by Name");
        System.out.println("6. Sort products ascending, descending by price");
        System.out.println("7. Exit");
        int choice1 = Integer.parseInt(scanner.nextLine());

        switch (choice1) {
            case 1:
                addProduct(creatProduct());
                break;
            case 2:
                editById();
                break;
            case 3:
                deleteById();
                break;
            case 4:
                showList();
                break;
            case 5:
                searchName();
                break;
            case 6:
                sortProduct();
                break;
            case 7:
                System.exit(0);
        }

    }

    public Product creatProduct() {
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter product ID");
        int id = Integer.parseInt(scanner.nextLine());
        return new Product(name, id, price);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editById() {
        System.out.println("Enter the product id you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = 0;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                products.set(index, creatProduct());
            }

        }
    }

    public void deleteById() {
        System.out.println("Enter the product id you want to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                products.remove(index);
            }
        }
    }

    public void showList() {
        for (Product p : products) {
            System.out.println(p);
        }

    }

    public void searchName() {
        System.out.println("Enter the product name :");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i));
            }
        }

    }

    public void sortProduct() {
        System.out.println("1. Enter sort price down: ");
        System.out.println("2. Enter sort price increase: ");
        int choice2 = Integer.parseInt(scanner.nextLine());
        switch (choice2) {
            case 1:
                products.sort(new SortByPriceDown());
                showList();
                break;
            case 2:
                products.sort(new SortByPriceIncrease());
                showList();
                break;
        }
    }
}


