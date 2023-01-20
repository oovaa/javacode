import java.util.ArrayList;
import java.util.List;

class test {
  public static void main(String[] args) {
    man m1 = new man(0, "omer");
    man m2 = new man(10, "ahmed");
    man m3 = new man(20, "tata");

    ArrayList<man> a = new ArrayList<>();
    a.add(m1);
    a.add(m2);
    a.add(m3);

    boolean isJohnAlive = a.stream().anyMatch(o -> "omer".equals(o.getName()));

    System.out.println(isJohnAlive);
  }

  static boolean containsName(final List<man> list, final int ag) {
    return list.stream().anyMatch(o -> ag == (o.getAg()));
  }
}

class man {
  int ag;
  String name;

  man(int ag, String name) {
    this.ag = ag;
    this.name = name;
  }

  /**
   * @return the ag
   */
  public int getAg() {
    return ag;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
}
// int sum =0;
// HashMap<Character , Integer> test = new HashMap<>();
// test.put('I', 1);
// test.put('V', 5);
// test.put('X', 10);
// test.put('L', 50);
// test.put('C', 100);
// test.put('D', 500);
// test.put('M', 1000);

// char[] cs = s.toCharArray();
// for (int i = 0; i < cs.length-1; i++){
// if(i==cs.length -1){
// sum+=test.get(cs[cs.length-1]);
// }
// else if(test.get(cs[i+1]) == test.get(cs[i])){
// sum +=test.get(cs[i]) + test.get(cs[i+1]);
// i++;
// }
// if(test.get(cs[i+1]) > test.get(cs[i])){
// sum += test.get(cs[i+1]) -test.get(cs[i]);
// i++;
// }
// else if(test.get(cs[i+1]) < test.get(cs[i])){
// sum += test.get(cs[i]) + test.get(cs[i+1]);
// i++;
// }
// }
// System.out.println(sum);