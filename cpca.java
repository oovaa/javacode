public class cpca {
    public static void main(String[] args) {
        div("moonmoonmoon");
    }
    static void div(String s){
        String a =String.valueOf(s.charAt(0));
      
       String[] ans = s.split(a);
       int ti =ans.length -1;
       for (String i : ans) {
        System.out.print(i+" ");
        
       }
       System.out.println(ti);
    }
}
