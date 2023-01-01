public class cpc {
    public static void main(String[] args) {
        int boxz =24;
        int kids = 4;
fd(boxz,  kids);
    }
  static void fd(int boxz , int kids){

   boolean result = false;
   if (boxz >= kids && boxz%kids ==0 ) {
    result = true;
   } 
   else result = false;
 
   if(result){
    System.out.println("YES");
   }else System.out.println("NO");
   
  }

}
