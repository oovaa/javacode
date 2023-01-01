public class cpc3 {
    public static void main(String[] args) {
        int n1 = 365;
db16(n1);
    }
    static void db16(int n){
        while (n >0){
            if(n%16 ==0){
                System.out.println("YES " + n);
                return;
            }
            else
             n/=10;
            
           if(n<=9&&n>=0 && n%16 ==0)
           System.out.println("NO");
        }
    }
}
