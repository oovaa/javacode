public class ballonnum {
    public static void main(String[] args) {
     String text = "loonbalxballpoon";
     System.out.println(maxNumberOfBalloons(text));

    }
    public static int maxNumberOfBalloons(String text) {
    //     int ans = 0;
    //    String tar = "balloon";
    //    StringBuilder hold = new StringBuilder();
    //    for (int i = 0; i < text.length(); i++) {
    //     String ss = text.substring(i, i+1);
    //     if(tar.contains(ss)){
    //     hold.append(ss);
    //     }
    //    } 
       
    // System.out.println(hold);
  
       
            int b = 0, a = 0, l = 0, o = 0, n = 0;
            
            for(char ch : text.toCharArray()){
                switch(ch){
                    case 'b': ++b;
                            break;
                    case 'a': ++a;
                            break;
                    case 'l': ++l;
                            break;
                    case 'o': ++o;
                            break;
                    case 'n': ++n;
                            break;
                
                }
            }
            
            return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
        }
    }
