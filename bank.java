import java.util.Scanner;

class bank {
static Scanner s = new Scanner(System.in);
static  int pass =123;
static int balance = 10000;
static int ep;
static int amount;
    public static void main(String[] args) {
        

System.out.println("enter pass: ");
 ep = s.nextInt();
if(pass == ep){
 right();

   }
   else{
   wrong();
   }
  
   }
    static void wrong() {
        System.out.println("wrong pass try again \n !! Note : you have 3 attempts");
        for (int i = 0; i < 3; i++) {
          System.out.println("enter pass: ");
        ep = s.nextInt();
        if (ep ==pass) {
            right();
            break;
        }

    }
}

    static void right(){
        System.out.println("Select operation : \n 1- show balance \n 2- deposit \n 3- cash withdrawal ");
        switch(s.nextInt()){
        case 1 : System.out.println("your balance is :"+balance+"$");
        break;
       
        case 2 : System.out.println("enter amount of money");
        amount =s.nextInt();
        System.out.println("your balance is :"+(balance+amount)+"$");
        break;
       
        case 3 :
        System.out.println("enter amount of money");
        amount =s.nextInt();
        if(amount > balance){
            System.out.println("NO!  you are too broke for that");
            break;
            }
        System.out.println("your balance is :"+(balance-amount)+"$");
        break;

        default : System.out.println("wrong operation try again !");
       
        }
    }
    }
   

