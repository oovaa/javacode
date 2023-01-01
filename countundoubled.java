public class countundoubled {
    public static void main(String[] args) {
   
      System.out.println(ballons("ssaadd"));
}

    static int ballons(String s){
     String s1 ="";
        for (int i = 0; i < s.length(); i++) {
           if (s1.matches((".*")+s.charAt(i)+(".*"))) {
            continue;
           } else{
           s1 = s1+s.substring(i, i+1);

           }
        }
      return s1.length();
    }
}
