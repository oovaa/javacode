import java.util.ArrayList;

public class teacherChallange {
    public static void main(String[] args) {
        String[] test = { "eat", "tea", "omar", "ramo", "book", "koob" };

        String[] na = filter(test);

        for (String string : na) {
            System.out.println(string);
        }
    }

    static String[] filter(String[] arr) { ///abo alzoooooooot
        ArrayList<Integer> hold = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        int sum;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (char c : arr[i].toCharArray()) {
                sum += c;
            }
            if (!hold.contains(sum)) {
                hold.add(sum);
                ans.add(arr[i]);
            }
        }

        return ans.toArray(new String[0]);
    }
}