import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(34);
        a.add(54);
        a.add(46);
        a.add(14);
        System.out.println(a);
        mergeSort(a);
        System.out.println(a);
    }

    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() > 1) {
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();

            int middle = list.size() / 2;
            for (int i = 0; i < middle; i++) {
                left.add(list.get(i));
            }
            for (int i = middle; i < list.size(); i++) {
                right.add(list.get(i));
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i) < right.get(j)) {
                    list.set(k, left.get(i));
                    i++;
                } else {
                    list.set(k, right.get(j));
                    j++;
                }
                k++;
            }
            while (i < left.size()) {
                list.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()) {
                list.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }
}