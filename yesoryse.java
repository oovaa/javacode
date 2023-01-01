public class yesoryse {
    public static void main(String[] args) {
        
        System.out.println(check("yes"));
    }
    static boolean check(String s){
    if (s.toUpperCase().equals("YES")) {
        return true;
    }
    else return false;
    }
}
