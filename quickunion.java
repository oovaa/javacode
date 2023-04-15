import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {
ed
  // creates n-by-n grid, with all sites initially blocked
  public Percolation(int n)

  // opens the site (row, col) if it is not open already
  public void open(int row, int col)

  // is the site (row, col) open?
  public boolean isOpen(int row, int col)

  // is the site (row, col) full?
  public boolean isFull(int row, int col)

  // returns the number of open sites
  public int numberOfOpenSites()

  // does the system percolate?
  public boolean percolates()

  // test client (optional)
  public static void main(String[] args)
}



// public class quickunion {

//   int[] id;
//   int[] sz;

//   public static void main(String[] args) {
//     quickunion t = new quickunion(9);
//     t.union(3, 6);
//     t.union(7, 6);
//     t.union(2, 1);
//     t.union(3, 1);
//     t.print();
//     System.out.println("\n" + t.sz[6]);
//     System.out.println(t.find(3));
//   }

//   public quickunion(int n) {
//     this.id = new int[n];
//     this.sz = new int[n];
//     for (int i = 0; i < id.length; i++) {
//       id[i] = i;
//       sz[i] = 1;
//     }
//   }

//   private int root(int i) {

//     while (i != id[i]) {
//       id[i]=id[id[i]];
//       i = id[i];
//     }
//     return i;
//   }

//   boolean connected(int p, int g) {
//     int pid = root(p);
//     int gid = root(g);
//     return pid == gid;
//   }

//   int find(int i) {
//     return root(i);
//   }

//   void union(int p, int q) {
//     int pi = root(p);
//     int qi = root(q);
//     if (pi == qi) return;
//     if (sz[pi] > sz[qi]) {
//       id[qi] = pi;
//       sz[pi] += sz[qi];
//     } else {
//       id[pi] = qi;
//       sz[qi] += sz[pi];
//     }
//   }

//   void print() {
//     for (int i : id) {
//       System.out.print(i + " ");
//     }
//     System.out.println();
//     for (int i : sz) {
//       System.out.print(i + " ");
//     }
//   }
// }
