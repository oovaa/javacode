import java.util.LinkedList;
import java.util.Queue;

public class ds {
    public static void main(String[] args) {
        // int[] ar = {1,2,3,4,5,6,7,8,9};
        // intrepolationsearch(ar,6) ;

        // System.out.println(binarysearch(ar, 1));


        Queue<Integer> s = new LinkedList<>();
        s.offer(25);
        s.offer(5);
        s.offer(23);
        System.out.println(s.toArray()[2]);
        System.out.println(s);

    }

     static int intrepolationsearch(int[] ar, int value) {

        return 0;
    }
     static int binarysearch(int[] arr, int target) {

    int low = 0 ;
    int high = arr.length-1;
   
while(low <= high){
    int middle = low + (high - low)/2;
    // int value = arr[middle];
System.out.println("middle is "+ middle);

if (target > middle) low = middle+1;
else if(target < middle) high = middle-1;
else return middle;

}

        return -1;
    }

}

