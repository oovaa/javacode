public class stears {
    public static void main(String[] args) {
      System.out.println(climbStairs(7));   
    }
    static public int climbStairs(int n) {
    
    //result = ((1/Math.sqrt(5))*(Math.pow(n+1, (1+Math.sqrt(5))))/2)-((1/Math.sqrt(5))*(Math.pow(n+1, (1-Math.sqrt(5))))/2);
    int a = 0, b = 1, c;
        if (n == 0)
            return a;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    
// return result;
}
}
