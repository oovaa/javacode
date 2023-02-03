import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

  public static void main(String[] args) {
    int[] candies = { 2, 3, 5, 1, 3 };
    int extra = 3;

    List<Boolean> a = kidsWithCandies(candies, extra);
    for (Boolean a1 : a) {
      System.out.print(a1 + " ");
    }
  }

  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> ans = new ArrayList<>();
    int max = 0;
    for (int i : candies) {
      if (i > max) max = i;
    }

    for (int i : candies) {
      ans.add(i + extraCandies >= max);
    }
    return ans;
  }
}
