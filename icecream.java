import java.util.Scanner;
public class icecream {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int money;
         int more;
         int sum =0;

        System.out.println(" u want it mixed or sada?");
        String ans = s.nextLine();
        if (ans.equals("sada")) {
            System.out.println("pick a flavor \n1- mango 4$\n 2- banana 3$\n 3- chocolate 6$\n 4- vanilla 5$");
            switch (s.nextInt()) {
                case 1: System.out.println("you picked mango ");
                    System.out.println("pay me mf ");
                    money =s.nextInt(); 
                    if(money <4 ) {
                        System.out.println("give me more!!");
                        more = s.nextInt();
                        money = money+ more;
                    }
                    System.out.println(" take your change"+(money-4));
                    break;
            
                    case 2: System.out.println("you picked banana ");
                    System.out.println("pay me mf ");
                    money =s.nextInt();
                    if(money <3 ) {
                        System.out.println("give me more!!");
                        more = s.nextInt();
                        money = money+ more;
                    }
                    System.out.println(" take your change"+(money-3));
                    break;

                    case 3: System.out.println("you picked chocolate ");
                    System.out.println("pay me mf ");
                    money =s.nextInt();
                    if(money <6 ) {
                        System.out.println("give me more!!");
                        more = s.nextInt();
                        money = money+ more;
                    }
                    System.out.println(" take your change"+(money-6));
                    break;

                    case 4: System.out.println("you picked vanilla ");
                    System.out.println("pay me mf ");
                    money =s.nextInt();
                    if(money <6 ) {
                        System.out.println("give me more!!");
                        more = s.nextInt();
                        money = money+ more;
                    }
                    System.out.println(" take your change"+(money-5));
                    break;
                default: System.out.println(" wrong choice");
                    break;
            }
        }
        else if(ans.equals("mixed")){
         System.out.println("pick 3 flavors");
        for (int i = 0; i < 3; i++) {
        
        System.out.println("1- mango 4$\n 2- banana 3$\n 3- chocolate 6$\n 4- vanilla 5$");
            switch (s.nextInt()) {
                case 1: System.out.println("you picked mango ");
                sum +=4;
                    break;
            
                    case 2: System.out.println("you picked banana ");
                    sum+=3;
                    break;

                    case 3: System.out.println("you picked chocolate ");
                    sum+=6;
                    break;

                    case 4: System.out.println("you picked vanilla ");
                    sum+=5;
                    break;

                default: System.out.println(" wrong choice");
                    break;
            }
           
        }
        System.out.println("tihs ice cream cost "+sum+"$");
        System.out.println("pay me mf ");
                money =s.nextInt();
                if(money <sum ) {
                    System.out.println("give me more !!");
                    more = s.nextInt();
                    money = money+ more;
                }
                System.out.println(" take your change "+(money-sum));
        }
    s.close();
    }
}
