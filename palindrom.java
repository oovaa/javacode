public class palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    static public boolean isPalindrome(int x) {
        boolean result =false;
        Integer x1 =x;
        String si = x1.toString();
       char[] ch = si.toCharArray();
       for (int i = 0 , j = ch.length-1; i < ch.length; i++,j--) {
        if(ch[i] == ch[j])
        result =true;
        else {
            result = false;
            break;
        }
       }
        return result;
    }
}

