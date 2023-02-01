//Minimum Number of Operations to Move All Balls to Each Box
public class nofop {

  public static void main(String[] args) {
    String boxes = "001011";
    int[] ans = minOperations(boxes);
    for (int i : ans) {
      System.out.print(i + " ");
    }
  }

  public static int[] minOperations(String boxes) {
    int[] arr = new int[boxes.length()];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (boxes.charAt(j) == '1') {
          arr[i] += Math.abs(j - i);
        }
      }
    }

    return arr;
  }
}
