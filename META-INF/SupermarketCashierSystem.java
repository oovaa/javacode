import java.util.ArrayList;
import java.util.Scanner;

public class SupermarketCashierSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the manager name: ");
        String manager = in.nextLine();

        System.out.print("Enter the number of products in the market: ");
        int numberOfProducts = in.nextInt();
        in.nextLine();

        Cashier cashier = new Cashier(numberOfProducts);
        cashier.setManagerName(manager);

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter the details of product #" + (i + 1) + ": ");
            System.out.print("Product Name: ");
            String name = in.nextLine();
            System.out.print("Product Price: ");
            double price = in.nextDouble();
            in.nextLine();

            Product product = new Product(name, price);
            cashier.addProduct(product);
        }

        int endDay;
        do {
            cashier.menu();
            System.out.print("How many products does the customer want to buy? ");
            int numberOfProduct = in.nextInt();

            for (int i = 0; i < numberOfProduct; i++) {
                System.out.print("Enter the number of the product #" + (i + 1) + " (Enter 0 to see the menu): ");
                int nump = in.nextInt();
                if (nump == 0) {
                    cashier.menu();
                } else {
                    cashier.addToCart(nump - 1);
                }
            }

            cashier.printReceipt();
            System.out.print("\nIs this the end of the day? Enter 0 if it is: ");
            endDay = in.nextInt();
        } while (endDay != 0);

        System.out.println("\nYou sold " + cashier.getProductSell() + " products today!");
        cashier.printTotalProducts();
        in.close();
    }
}

class Product {
    private String name;
    private double price;
    private static int totalProducts = 0;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalProducts++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }
}

class Cashier {
    private int receiptNumber = 1;
    private String manager;
    private int productSell = 0;
    private Product[] products;
    private ArrayList<Product> cart = new ArrayList<>();
    private int productCount = 0;

    public Cashier(int numberOfProducts) {
        products = new Product[numberOfProducts];
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("ERROR! Your cart is already full.");
        }
    }

    public void setManagerName(String manager) {
        this.manager = manager;
    }

    public String getManagerName() {
        return manager;
    }

    public void addToCart(int productNum) {
        if (productNum >= 0 && productNum < products.length) {
            cart.add(products[productNum]);
            productSell++;
        } else {
            System.out.println("Invalid product number.");
        }
    }

    public void menu() {
        System.out.printf("\n\n %17s \n", "THE MENU");
        System.out.printf("\033[0;1m Name");
        System.out.printf(" %22s \n", "Price");
        System.out.print("\033[0;0m");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.print(" " + (i + 1) + "." + product.getName());
            int nameLength = product.getName().length();
            for (int j = 0; j < (20 - nameLength); j++) {
                System.out.print(" ");
            }
            System.out.println("$" + product.getPrice());
        }
        System.out.println("\n");
    }

    public int getProductSell() {
        return productSell;
    }

    public void printTotalProducts() {
        System.out.println("\nTotal Products Created Today: " + Product.getTotalProducts());
    }

    public void printReceipt() {
        double totalCost = 0;
        System.out.println("\033[0;1m");
        System.out.printf("\n %18s ", "QUICKMART");
        System.out.print("\033[0;0m");
        System.out.println("\n Receipt: " + receiptNumber);
        receiptNumber++;
        System.out.println(" Manager: " + getManagerName());
        System.out.println(" Address: 204 Peace Gardens");
        System.out.println(" Apt.838 Khartoum, BC X4T9C2");
        System.out.println("——————————————————————————————");
        System.out.print("\033[0;1m");
        System.out.printf(" %20s ", "CASH RECEIPT");
        System.out.print("\033[0;0m");
        System.out.println("\n——————————————————————————————");
        System.out.printf("\033[0;1m Description");
        System.out.printf(" %15s \n", "Price");
        System.out.print("\033[0;0m");
        for (Product product : cart) {
            System.out.print(" " + product.getName());
            int nameLength = product.getName().length();
            for (int j = 0; j < (22 - nameLength); j++) {
                System.out.print(".");
            }
            System.out.println("$" + product.getPrice());
            totalCost += product.getPrice();
        }
        System.out.println("——————————————————————————————");
        System.out.print(" \033[0;1mTotal\033[0;0m");
        System.out.print("..................");
        System.out.printf("$%1.2f\n", totalCost);
        System.out.println("——————————————————————————————");
        System.out.print("\033[0;1m");
        System.out.printf(" %25s \n", "THANK YOU FOR SHOPPING!");
        System.out.println("\033[0;0m");
        cart.clear();
    }
}