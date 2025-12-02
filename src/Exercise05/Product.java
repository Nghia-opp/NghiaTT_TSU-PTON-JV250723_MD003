package Exercise05;

import java.util.Scanner;

public class Product {
    private int productID;
    private String productName;
    private int productPrice;

    public Product() {
    }

    public Product(int productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void inputProduct(Scanner scanner) {
        System.out.println("Nhap ID san pham: ");
        productID = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Name san pham: ");
        productName = scanner.nextLine();
        System.out.println("Nhap Price san pham: ");
        productPrice = Integer.parseInt(scanner.nextLine());
    }

    public void displayProduct(Scanner scanner) {
        System.out.println("ID: " + productID + " Name: " + productName + " Price: " + productPrice);
    }
}
