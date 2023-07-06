import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

public class superMarket {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("whelcome to our humble supermarket");
    Grocery g = new Grocery();
    g.buy("milk", 4.6, 3);
    g.buy("beef", 12.3, 2);
    g.buy("banana", 2.4, 5);
    g.return1(Grocery.lst.get(2));
    // g.buy("", 4.6, 3);
    g.list();
    
  }
}

class Grocery {

  static ArrayList<Grocery> lst = new ArrayList<>();
  static double total;
  String name;
  double price;
  double quantity;

  //  String color;

  Grocery() {}

  Grocery(String name, double price, double quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    total += this.price * this.quantity;
    lst.add(this);
  }

  void list() {
    for (int i = 0; i < lst.size(); i++) {
      System.out.println(i + 1 + "- " +lst.get(i).name + " = " + lst.get(i).price);
    }
    
    System.out.println("\ntotal = "+ total);
  }
  void buy(String name, double price,double quantity){
    new Grocery(name, price, quantity);
  }
  void return1(Grocery i){
    total-=i.price*i.quantity;
    lst.remove(i);
  }
}

class DairyProduct extends Grocery {}

class Beverage extends Grocery {}
