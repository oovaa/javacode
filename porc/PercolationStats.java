import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {

  private static final double CON = 1.96;
  private double[] fractions;
  private int experimentsCount;

  // perform independent trials on an n-by-n grid
  public PercolationStats(int n, int t) {
    if (t <= 0 || n <= 0) {
      throw new IllegalArgumentException("(t<=0 || n<=0)");
    }
    experimentsCount = t;
    fractions = new double[experimentsCount];
    for (int i = 0; i < experimentsCount; i++) {
      Percolation p = new Percolation(n);
      int oppensites = 0;

      while (!p.percolates()) {
        int a = StdRandom.uniformInt(1, n + 1);
        int b = StdRandom.uniformInt(1, n + 1);
        if (!p.isOpen(a, b)) {
          p.open(a, b);
          oppensites++;
        }
      }
      double fraction = (double) oppensites / (n * n);
      fractions[i] = fraction;
    }
  }

  // sample mean of percolation threshold

  public double mean() {
    return StdStats.mean(fractions);
  }

  // sample standard deviation of percolation threshold
  public double stddev() {
    return StdStats.stddev(fractions);
  }

  // low endpoint of 95% confidence interval
  public double confidenceLo() {
    return mean() - (CON * stddev()) / Math.sqrt(experimentsCount);
  }

  // high endpoint of 95% confidence interval
  public double confidenceHi() {
    return mean() + (CON * stddev()) / Math.sqrt(experimentsCount);
  }

  // test client (see below)
  public static void main(String[] args) {
    int n = 10;
    int t = 10;
    if (args.length >= 2) {
      n = Integer.parseInt(args[0]);
      t = Integer.parseInt(args[1]);
    }

    PercolationStats ps = new PercolationStats(n, t);
    String confidance = ps.confidenceHi() + " , " + ps.confidenceLo();

    StdOut.println("mean     " + ps.mean());
    StdOut.println("stddev     " + ps.stddev());
    StdOut.println("confidance     " + confidance);
  }
}
