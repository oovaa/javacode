public class test {

  public static void main(String[] args) {
    String s = "RRDDLU";
    for (int i = 0; i < args.length; i++) {
      s =s.substring(s.indexOf(s.charAt(0)), s.length());
      System.out.println(s);
    }
    // HashMap<Integer, Character> hh = new HashMap<>();
    // char c = 'a';
    // for (int i = 0; i < 10; i++) {
    //   hh.put(i, c++);
    // }
    // System.out.println(hh);
    // Random r = new Random();
    // int x = r.nextInt(7);
    // System.out.println(x);

    // int[] i ={1,2,5,6,7,7,8,9};
    // int r[] = new int[i.length*2];
    // for (int j = 0; j < i.length; j++) {
    //    r[j] = i[j];
    // }
    // i=r;
    // for (int j : i) {
    //    System.out.println(j);
    // }

    //  String a = "omer";
    //  String ar[] = a.split("");
    //  for (String s : ar) {
    //     System.out.println(s+" "+s.getClass());
    //  }
  }
}
