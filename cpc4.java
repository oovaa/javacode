public class cpc4 {
    public static void main(String[] args) {
        int x =1000 ,y =1;
        wifi(x, y);
    }
    static void wifi(int x , int y){
    double area = x*y;

    double result = Math.floor(area/8);
    System.out.println(result);
    }
}
