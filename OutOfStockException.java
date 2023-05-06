/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/
/*
public class OutOfStockException {

    public static void main(String args[]) {

    }
}
*/
import java.util.Scanner;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class StockManager {
    private int stock;

    public StockManager(int initialStock) {
        this.stock = initialStock;
    }

    public void addStock(int qty) {
        this.stock += qty;
        System.out.println("Stock added successfully.");
    }

    public void purchase(int qty) throws OutOfStockException {
        if (this.stock < qty) {
            throw new OutOfStockException("Sorry, the requested quantity is not available in stock.");
        } else {
            this.stock -= qty;
            System.out.println("Purchase completed successfully.");
        }
    }

    public void displayStock() {
        System.out.println("Current stock: " + this.stock);
    }
}

public class OutOfStockException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Stock Management System!");
        System.out.println("Please choose an option:");
        System.out.println("1. Add Stock");
        System.out.println("2. Purchase Product");
        System.out.println("3. Display Stock");

        StockManager stockManager = new StockManager(100);

        while (true) {
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please enter the quantity to add:");
                    int addQty = scanner.nextInt();
                    stockManager.addStock(addQty);
                    break;
                case 2:
                    System.out.println("Please enter the quantity to purchase:");
                    int purchaseQty = scanner.nextInt();
                    try {
                        stockManager.purchase(purchaseQty);
                    } catch (OutOfStockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    stockManager.displayStock();
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            System.out.println("Please choose an option:");
            System.out.println("1. Add Stock");
            System.out.println("2. Purchase Product");
            System.out.println("3. Display Stock");
        }
    }
}
