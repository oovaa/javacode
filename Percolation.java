import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

  int[] id;
  int[] sz;

  public static void main(String[] args) {
    // Percolation t = new Percolation(9);
    // t.union(3, 6);
    // t.union(7, 6);
    // t.union(2, 1);
    // t.union(3, 1);
    // t.print();
    // System.out.println("\n" + t.sz[6]);
    // System.out.println(t.find(3));
    // System.out.println(t.find());
  }

  public Percolation(int n) {
    this.id = new int[n];
    this.sz = new int[n];
    for (int i = 0; i < id.length; i++) {
      id[i] = i;
      sz[i] = 1;
    }
  }

  private int root(int i) {

    while (i != id[i]) {
      id[i]=id[id[i]];
      i = id[i];
    }
    return i;
  }

  boolean connected(int p, int g) {
    int pid = root(p);
    int gid = root(g);
    return pid == gid;
  }

  int find(int i) {
    return root(i);
  }
  int find() {
    int m1 = id[0];
    for (int i : id) {
      m1 = Math.max(i, m1);
    }
    return m1;
  }

  void union(int p, int q) {
    int pi = root(p);
    int qi = root(q);
    if (pi == qi) return;
    if (sz[pi] > sz[qi]) {
      id[qi] = pi;
      sz[pi] += sz[qi];
    } else {
      id[pi] = qi;
      sz[qi] += sz[pi];
    }
  }

  void delete(int i){
    int sec =0;
  for (int j = 0; j < id.length; j++) {
    if (id[j]>sec && id[j] <=id[i]) 
      sec = id[j];
  }

  }
  void print() {
    for (int i : id) {
      System.out.print(i + " ");
    }
    System.out.println();
    for (int i : sz) {
      System.out.print(i + " ");
    }
  }
}
