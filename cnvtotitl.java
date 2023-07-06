import java.util.HashMap;

public class cnvtotitl {

  public static void main(String[] args) {
    System.out.println(convertToTitle(26));
  }

  public static char convertToTitle(int columnNumber) {
    HashMap<Integer, Character> map = new HashMap<>();
    int v = 1;
    for (Character i = 'A'; i  <='Z'; i++) {
      map.put(v, i);
      v++;
    }
    System.out.println(map);

    return map.get(columnNumber);
  }
}
