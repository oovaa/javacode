public class eltypedit {
    public static void main(String[] args) {
        String s = "MCDLXXVI";
        romanToInt(s);
    }

    public static void romanToInt(String s) {
        int ans = 0;
        int hold=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    hold = 1;break;
                case 'V':
                    hold = 5;  break;                 
                case 'X':
                    hold = 10;break;
                case 'L':
                    hold = 50; break;
                case 'C':
                    hold = 100; break;
                case 'D':
                    hold = 500; break;
                case 'M':
                    hold = 1000; break;
            }
             ans +=hold;
        }
       
System.out.println(ans);
    }
}