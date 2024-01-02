class MaximumNumberofEventsThatCanBeAttended {

  public static void main(String[] args) {}

  public int maxEvents(int[][] events) {
    int start = events[0][0];
    for (int i = 0; i < events.length; i++) if (events[i][0] < start) start =
      events[i][0];

      
    return 0;
  }
}
