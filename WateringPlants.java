public class WateringPlants {

  public static void main(String[] args) {
    int[] plants = { 1, 1, 1, 4, 2, 3 };
    int capacity = 4;
    System.out.println(wateringPlants(plants, capacity));
    for (int i : plants) {
      System.out.print(i + " ");
    }
  }

  static int wateringPlants(int[] plants, int capacity) {
    int ans = 0;
    int full = capacity;
    for (int i = 0; i < plants.length; i++) {
      if (plants[i] > capacity) {
        ans += i * 2;
        capacity = full;
      }
      if (capacity >= plants[i]) {
        capacity -= plants[i];
      }
      ans++;
    }
    return ans;
  }
}
//plants[i] = 0;
// Input: plants = [2,2,3,3], capacity = 5
// Output: 14
// Explanation: Start at the river with a full watering can:
// - Walk to plant 0 (1 step) and water it. Watering can has 3 units of water.
// - Walk to plant 1 (1 step) and water it. Watering can has 1 unit of water.
// - Since you cannot completely water plant 2, walk back to the river to refill (2 steps).
// - Walk to plant 2 (3 steps) and water it. Watering can has 2 units of water.
// - Since you cannot completely water plant 3, walk back to the river to refill (3 steps).
// - Walk to plant 3 (4 steps) and water it.
// Steps needed = 1 + 1 + 2 + 3 + 3 + 4 = 14.
