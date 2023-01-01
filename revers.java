import java.util.Scanner;

class revers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string");
        String s1;
        s1 =s.nextLine();
        StringBuffer rs1 = new StringBuffer("");
        
        for (int i = s1.length() -1; i >=0; i--) {
            rs1.append(s1.charAt(i));
        }
        System.out.println(rs1);
        s.close();
    }
}