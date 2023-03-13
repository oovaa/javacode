class MinimumOperationstoMakeArrayEqual {

  public static void main(String[] args) {
    System.out.println(minOperations(6));
  }

  static int minOperations(int n) { //a better sol
    int ans = 0;

    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i * 2) + 1;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    int t = (n % 2 == 1) ? arr[n / 2] : arr[n / 2] - 1;
    while (arr[0] != t) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > t) arr[i]--; else if (arr[i] < t) arr[i]++;
      }
      for (int i : arr) {
        System.out.print(i + " ");
      }
      ans++;
      System.out.println();
    }
    System.out.println(t);

    return ans;
  }
}
