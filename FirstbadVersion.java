public class FirstbadVersion {

  public static void main(String[] args) {}

  public int firstBadVersion(int n) {
    int first = 0, end = n;
    while (first < end) {
      int mid = first + (end - first) / 2;

      if (isBadVersion(mid)) end = mid - 1; else first = mid + 1;
    }

    return first;
  }
}
