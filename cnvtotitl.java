import java.util.HashMap;

public class cnvtotitl {
    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }
    public static String convertToTitle(int columnNumber) {
        HashMap<Integer,String>  map = new HashMap<>();
        int v = 1;
for (String i = "A"  ; !(i.equals("Z"));  ) {
    map.put(v, i);
    v++;
}
   return map.get(columnNumber);
    }
}

