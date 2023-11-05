import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 1, 0, 1, 99 };
    SingleNumberII solution = new SingleNumberII();
    System.out.println(solution.singleNumber(nums));
  }

  /**
   * Finds the single number in an array where every element appears three times except for one.
   *
   * @param nums The input array.
   * @return The single number.
   */
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int i : map.keySet()) {
      if (map.get(i) == 1) return i;
    }
    return 0;
  }
}
// for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//   System.out.println(entry.getKey() + ": " + entry.getValue());
// }
