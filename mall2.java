import java.util.ArrayList;
import java.util.Scanner;

public class mall2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String id;
        String OwnerName;
        int OwnerPass;
        new ShopOwner("omer", 123);
        new ShopOwner("ahmed", 321);
        new ShopOwner("tata", 567);
        ShopOwner.crateOwner("lina", 341);
        ShopOwner.addShop();
        ShopOwner.addShop();
        ShopOwner.addShop();
        ShopOwner.addProduct(1, "pizza");
        ShopOwner.addProduct(1, "tagalia");
        ShopOwner.addProduct(2, "pants");
        ShopOwner.addProduct(2, "cap");
        ShopOwner.addProduct(0, "mac");
        ShopOwner.addProduct(0, "dell");

        System.out.println("are u owner or customer?");
        id = s.nextLine();
        if (id.equals("owner")) {
            System.out.println("enter Owner name");
            OwnerName = s.nextLine();
            System.out.println("enter Owner pass");
            OwnerPass = s.nextInt();
            if (ShopOwner.Check(OwnerName, OwnerPass)) {
                int shopIndex;
                int productIndex;
                String productName;
                Character a;

                System.out.println("here is your list\n1-Add shop\n2-remove Shop\n3-edit Shop\n4-add Owner");
                switch (s.nextInt()) {
                    case 1:
                        ShopOwner.addShop();
                        System.out.println("new shop where added!!");
                        ShopOwner.printShops();

                        break;
                    case 2:
                        System.out.println("enter Shop number u wanna remove : ");

                        shopIndex = s.nextInt() - 1;
                        ShopOwner.removeShop(shopIndex);
                        System.out.println("shop Were removed !");
                        ShopOwner.printShops();
                        break;

                    case 3:
                        System.out.println("here is What you can do\nA-Add product\nB-remove prudoct\nC-edit product");
                        a = s.next().charAt(0);
                        switch (Character.toUpperCase(a)) {
                            case 'A':
                                System.out.println("enter Shop index :");
                                shopIndex = s.nextInt() - 1;
                                System.out.println("enter Product name");
                                s.nextLine();
                                productName = s.nextLine();
                                ShopOwner.addProduct(shopIndex, productName);
                                System.out.println("new product were added !!");
                                ShopOwner.printShops();

                                break;

                            case 'B':
                                System.out.println("enter Shop index :");
                                shopIndex = s.nextInt() - 1;
                                System.out.println("enter Product name");
                                s.nextLine();
                                productName = s.nextLine();
                                ShopOwner.removeProduct(shopIndex, productName);
                                System.out.println("new product were removed !!");
                                ShopOwner.printShops();

                                break;
                            case 'C':
                                System.out.println("enter Shop index :");
                                shopIndex = s.nextInt() - 1;
                                System.out.println("enter product index :");
                                productIndex = s.nextInt() - 1;
                                System.out.println("enter Product name");
                                s.nextLine();
                                productName = s.nextLine();
                                ShopOwner.modifyProduct(shopIndex, productIndex, productName);
                                System.out.println("new product were added !!");
                                ShopOwner.printShops();

                                break;
                            default:
                                System.out.println("wrong Choice");
                                break;
                        }
                        break;
                    case 4:
                        String newOwnerNAme;
                        System.out.println("enter new Owner's name :");
                        s.nextLine();
                        newOwnerNAme = s.nextLine();
                        System.out.println("enter new Owner's pass");
                        OwnerPass = s.nextInt();

                        ShopOwner.crateOwner(newOwnerNAme, OwnerPass);
                        System.out.println("you added new Owner !");
                        ShopOwner.PrintOwners();

                        break;

                    default:
                        System.out.println("wrong Choice");
                        break;
                }
            } else {
                System.out.println("wrong Owner name or password");
            }
        } else if (id.equals("customer")) {
            int shopIndex;
            int productIndex;
            boolean redo = true;
            Character answer;
            int Choice;

            System.out.println("You can browse shops and pick products ");

            while (redo) {
                System.out.println(
                        "What you wanna do ?\n1-add product to yor cart\n2-remove product from yor cart\n3-list products in yor catr: ");
                Choice = s.nextInt();
                switch (Choice) {

                    case 1:
                        ShopOwner.printShops();
                        System.out.print("select shop index :");
                        shopIndex = s.nextInt() - 1;
                        ShopOwner.printAShop(shopIndex);
                        System.out.println("select product index");
                        productIndex = s.nextInt() - 1;
                        Customer.addselectedProduct(shopIndex, productIndex);
                        Customer.printMyProducts();
                        break;

                    case 2:
                        Customer.printMyProducts();
                        System.out.println("select product index");
                        productIndex = s.nextInt() - 1;
                        Customer.removeselectedProduct(productIndex);
                        Customer.printMyProducts();
                        ;
                        break;

                    case 3:
                        Customer.printMyProducts();
                        break;

                    default:
                        System.out.println("Wrong Choice");
                        break;

                }
                System.out.println("still wanna shop? n =no : any thing else = yes");
                answer = s.next().charAt(0);
                if (answer == 'n') {
                    Cusromer.printMyProducts();
                    redo = false;
                    break;
                }
            }
        }
        s.close();
    }
}

class ShopOwner {
    int OwnerPass;
    String OwnerName;
    static int NumOfOwners;

    static ArrayList<ArrayList<String>> shops = new ArrayList<>();
    static ArrayList<String> shop = new ArrayList<>();
    static ArrayList<ShopOwner> shopOwners = new ArrayList<>();

    ShopOwner() {
        this("unnamed", 00000);
    }

    ShopOwner(String OwnerName, int OwnerPass) {
        this.OwnerName = OwnerName;
        this.OwnerPass = OwnerPass;
        shopOwners.add(this);
        NumOfOwners++;
    }

    public static void crateOwner(String OwnerName, int OwnerPass) {
        new ShopOwner(OwnerName, OwnerPass);
    }

    static boolean Check(String Enterdrname, int Enterdpass) {
        boolean isOwner = false;
        // int noc = 3;
        for (int i = 0; i < NumOfOwners - 1; i++) {
            if (Enterdrname.equals(shopOwners.get(i).OwnerName)) {
                if (Enterdpass == shopOwners.get(i).OwnerPass) {
                    isOwner = true;

                } else {
                    // if (noc > 0) {
                    // System.out.println("try again");
                    // }
                    return isOwner;
                }
            }

        }
        return isOwner;
    }

    static void PrintOwners() {
        for (ShopOwner x : shopOwners) {
            System.out.print(x.OwnerName + " ");
        }
    }

    static void printShops() {
        System.out.println(shops);
    }

    static void printAShop(int ShopIndex) {
        System.out.println(shops.get(ShopIndex));
    }

    // void printProduct(int ShopIndex , int ProductIndex){
    // ShopIndex -=1;
    // ProductIndex -=1;
    // shops.get(ShopIndex).get(ProductIndex);
    // }
    static void addShop() {
        shops.add(new ArrayList<String>());
    }

    static void removeShop(int ShopIndex) {
        shops.remove(ShopIndex);
    }

    static void addProduct(int shopIndex, String Productname) {
        shops.get(shopIndex).add(Productname);
    }

    static void removeProduct(int shopIndex, String Productname) {
        shops.get(shopIndex).remove(Productname);
    }

    static void modifyProduct(int shopIndex, int productIndex, String Productname) {
        shops.get(shopIndex).set(productIndex, Productname);
    }

}

class Customer {
    static Scanner s = new Scanner(System.in);
    int ShopIndex;
    int ProductIndex;

    Customer() {
    }

    static ArrayList<String> myProducts = new ArrayList<>();

    static void addselectedProduct(int ShopIndex, int productIndex) {
        System.out.println("you added " + ShopOwner.shops.get(ShopIndex).get(productIndex) + " to your cart");
        myProducts.add(ShopOwner.shops.get(ShopIndex).get(productIndex));
        System.out.println(myProducts);
    }

    static void removeselectedProduct(int ProductIndex) {
        System.out.println("you removed " + myProducts.get(ProductIndex) + " to your cart");
        myProducts.remove(ProductIndex);
        System.out.println(myProducts);
    }

    static void printMyProducts() {
        System.out.println(myProducts);

    }

    void showShop(int index) {
        System.out.println(ShopOwner.shops.get(index - 1));
    }
}