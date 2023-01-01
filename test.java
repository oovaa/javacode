class test {
  public static void main(String[] args) {
    ome o = new ome() {
      void hi() {
        System.out.println("hello");
      }
    };

    o.hi();

  }

  static void toint(String s) {
  }
}

class ome {

  void hi() {
    System.out.println("hiii");
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