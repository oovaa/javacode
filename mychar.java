import java.util.ArrayList;
import java.util.Scanner;

public class mychar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Character a;
        System.out.println("enter char");
        a=s.next().charAt(0);
        System.out.println(Character.toUpperCase(a));
        s.close();
    }
}
class Cusromer{
    int ShopIndex;
    int ProductIndex;
    String ProductName;

Cusromer(){
}
static ArrayList<String> myProducts = new ArrayList<>();

void addselectedProduct(int ShopIndex , int productIndex){

}
void removeselectedProduct(int ShopIndex , String productName){

}

static void printMyProducts(){


}
void showShop(int index){
System.out.println(ShopOwner.shops.get(index));
}

}
