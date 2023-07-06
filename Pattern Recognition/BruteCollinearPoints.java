import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MergeX;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class BruteCollinearPoints {

  private int numberOfSegments = 0;
  private final LineSegment[] segments;

  public static void main(String[] args) {
    // read the n points from a file
    In in = new In(args[0]);
    int n = in.readInt();
    Point[] points = new Point[n];
    for (int i = 0; i < n; i++) {
      String s = in.readString();
      if ("null".equals(s)) {
        points[i] = null;
      } else {
        int x = Integer.parseInt(s);
        int y = in.readInt();
        points[i] = new Point(x, y);
      }
    }

    BruteCollinearPoints collinear = new BruteCollinearPoints(points);

    // draw the points
    StdDraw.enableDoubleBuffering();
    StdDraw.setXscale(0, 32768);
    StdDraw.setYscale(0, 32768);
    for (Point p : points) {
      p.draw();
    }
    StdDraw.show();

    // print and draw the line segments
    for (LineSegment segment : collinear.segments()) {
      StdOut.println(segment);
      segment.draw();
    }
    StdDraw.show();
  }

  public BruteCollinearPoints(Point[] points) {
    if (points == null) {
      throw new IllegalArgumentException("points can't be null");
    }
    for (Point p : points) {
      if (p == null) {
        throw new IllegalArgumentException("point can't be null");
      }
    }

    Point[] p = new Point[points.length];
    System.arraycopy(points, 0, p, 0, points.length);
    segments = analyzeSegments(p);
  } // finds all line segments containing 4 points

  private LineSegment[] analyzeSegments(Point[] p) {
    LineSegment[] tSegment = new LineSegment[p.length * 4];
    MergeX.sort(p);

    for (int i = 0; i < p.length; i++) {
      for (int j = i + 1; j < p.length; j++) {
        for (int k = j + 1; k < p.length; k++) {
          for (int l = k + 1; l < p.length; l++) {
            Point a = p[i];
            Point b = p[j];
            Point c = p[k];
            Point d = p[l];
            if (
              a.slopeTo(b) == a.slopeTo(c) && c.slopeTo(d) == b.slopeTo(c)
            ) tSegment[numberOfSegments++] = new LineSegment(a, d);
          }
        }
      }
    }
    LineSegment[] result = new LineSegment[numberOfSegments];
    System.arraycopy(tSegment, 0, result, 0, numberOfSegments);
    return result;
  }

  public int numberOfSegments() {
    return numberOfSegments;
  } // the number of line segments

  public LineSegment[] segments() {
    LineSegment[] returnSegments = new LineSegment[segments.length];
    System.arraycopy(segments, 0, returnSegments, 0, segments.length);
    return returnSegments;
  } // the line segments
}
// Point[] getPoints() {
//   StdOut.println("Enter file name");
//   String fname = StdIn.readString();
//   try {
//     FileReader f = new FileReader(fname);
//     int data = f.read();
//     while (data != -1) {
//       System.out.print(((char) data));
//       data = f.read();
//     }
//     f.close();
//   } catch (IOException e) {
//     // TODO Auto-generated catch block
//     e.printStackTrace();
//   }
//   return null;
// }
