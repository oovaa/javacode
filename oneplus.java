import java.util.ArrayList;
// my art :)
public class oneplus {
    public static void main(String[] args) {
        
        int[] test = {9,9,9};
        int[] result = plusOne(test);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] +" ");
        }
    }
    public static int[] plusOne(int[] digits) {
       
         ArrayList<Integer> holder = new ArrayList<>();
        for (int i : digits) {
            holder.add(i);
        }
        
        if (holder.get((holder.size())-1) ==9) {
            for (int i = holder.size()-1; i >= 0; i--) {
                if (i ==0) {
                    if (holder.get(0) == 9) {
                        holder.set(0, 0);
                        holder.add(0, 1);
                    }
                    else{
                        holder.set(0, (holder.get(0))+1);
                    }
                }
                else{
                    if(holder.get(i)== 9){
                        holder.set(i, 0);
                    }
                    else{
                        holder.set(i, holder.get(i)+1);
                        break;
                    }
                }
                
            }
        }
        else {
            holder.set(((holder.size())-1), holder.get(((holder.size())-1))+1);
        }
         int[] result = new int[holder.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = holder.get(i);
        }

        return result;
    }
}
