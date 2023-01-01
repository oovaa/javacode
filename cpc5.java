import java.util.ArrayList;

public class cpc5{
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        perfor(arr);
    }
    static int min(ArrayList<Integer>array){
        int sum =array.get(0);
        for(int i=0;i<array.size();i++){
        
            if(sum>array.get(i)){
                sum = array.get(i);
            }
        }
        return sum;

    }
    static int max(ArrayList<Integer>array){
        int sum =array.get(0);
        for(int i=0;i<array.size();i++){
        
            if(sum<array.get(i)){
                sum = array.get(i);
            }
        }
        return sum;

    }
    static void perfor(ArrayList<Integer>array){
        ArrayList<Integer> ar = new ArrayList<>();
        int n = array.size();
        while(n!=0){
            ar.add(max(array));
            array.remove(max(array));
            ar.add(min(array));
            array.remove(min(array));
            n--;

        }
        System.out.println(ar);
    }
}