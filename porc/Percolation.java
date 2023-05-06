import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

  private static final int  TOP  = 0;
  private boolean[][] opened;
  private int size;
  private int bottom;
  private int oppensites;
  private WeightedQuickUnionUF wq;

  public Percolation(int n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    size = n;
    bottom = size * size + 1;
    wq = new WeightedQuickUnionUF(n * n + 2);
    opened = new boolean[size][size];
    oppensites = 0;
  }

  public static void main(String[] args)  { } 

  // opens the site (row, col) if it is not open already
  public void open(int row, int col) {
    checkexception(row, col);
    opened[row - 1][col - 1] = true;
    ++oppensites;

    if (row == 1) wq.union(getindex(row, col),  TOP );

    if (row == size) wq.union(getindex(row, col), bottom);

    if (row > 1 && isOpen(row - 1, col)) wq.union(
      getindex(row, col),
      getindex(row - 1, col)
    );

    if (row < size && isOpen(row + 1, col)) wq.union(
      getindex(row, col),
      getindex(row + 1, col)
    );

    if (col > 1 && isOpen(row, col - 1)) wq.union(
      getindex(row, col),
      getindex(row, col - 1)
    );

    if (col < size && isOpen(row, col + 1)) wq.union(
      getindex(row, col),
      getindex(row, col + 1)
    );
  }

  private int getindex(int row, int col) {
    return size * (row - 1) + col;
  }

  // is the site (row, col) open?
  public boolean isOpen(int row, int col) {
    checkexception(row, col);
    return opened[row - 1][col - 1];
  }

  // is the site (row, col) full?
  public boolean isFull(int row, int col) {
    checkexception(row, col);
    return wq.find( TOP ) == wq.find(getindex(row, col));
  }

  // returns the number of open sites
  public int numberOfOpenSites() {
    return oppensites;
  }

  // does the system percolate?
  public boolean percolates() {
    return wq.find( TOP ) == wq.find(bottom);
  }

  private void checkexception(int row, int col) {
    if (row <= 0 || row > size || col <= 0 || col > size) {
      throw new IllegalArgumentException("invalid index");
    }
  }
}
