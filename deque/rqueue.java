public class rqueue {

  // Random r = new Random();
  // int x = r.nextInt(7);//random 0-6
  int[] arr;
  int last;
  int first;
  int size = -1;

  public rqueue() {
    arr = new int[1];
  }

  public boolean isEmpty() {
    return this.size == -1;
  }

  public int size() {
    return this.size;
  }

  public void enqueue(int i) {
    size++;
    if (size == this.arr.length) extend();
    arr[size] = i;
  }

  public int dequeue() {
    size--;
    if (size < arr.length / 4) shrink();

    return 0;
  }

  public int sample() {
    return 0;
  }

  private void extend() {
    int[] hold = new int[arr.length * 2];
    for (int i = 0; i < arr.length; i++) {
      hold[i] = arr[i];
    }
    arr = hold;
  }

  private void shrink() {
    int[] hold = new int[arr.length / 2];
    for (int i = 0; i < size; i++) {
      hold[i] = arr[i];
    }
    arr = hold;
  }
}
