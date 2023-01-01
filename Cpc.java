public class Cpc {
    public static void main(String[] args) {
        int[] array = {10,1,2,3,6,11};
        int s = array[0];
        int m = 0;
        for (int i = 0; i < array.length; i++) {
          if(m < array[i])
          m = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if(s > array[i])
            s = array[i];
          }


System.out.println(Math.abs(m-s));
    }
}