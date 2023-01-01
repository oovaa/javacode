public class lolw {
    public static void main(String[] args) {
        String  s ="omer is homse";

       System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int result = 0;
        String[] r = s.split(" ");
 for (int i = 0; i < r[r.length -1].length(); i++) {
result++;
 }
     
        return result;
    }
}
