public class TakeGiftsFromtheRichestPile {

  public static void main(String[] args) {
    int[] gifts = { 25,64,9,4,100 };
    int k = 4;

    System.out.println(pickGifts(gifts, k));
  }

  static int pickGifts(int[] gifts, int k) {
    int ans = 0;
    int max = 0;

    for (int i = 0; i < k; i++) {
      for (int j = 0; j < gifts.length; j++) {
        if (gifts[j] > gifts[max]) max = j;
      }
      gifts[max] = (int) Math.floor(Math.sqrt(gifts[max]));
      max = 0;
    }
    for (int i : gifts) {
        System.out.println(i);
      ans += i;
    }
    return ans;
  }
}
