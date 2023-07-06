import edu.princeton.cs.algs4.MergeX;
import java.util.Random;

class test {

  public static void main(String[] args) {
    Random r = new Random(10);
    Point[] points = new Point[100];
    int segments = 0;
    LineSegment[] lines = new LineSegment[points.length * 4];

    for (int i = 0; i < points.length; i++) {
      int x = r.nextInt(11);
      int y = r.nextInt(11);
      points[i] = new Point(x, y);
    }

    int pointsinline = 2;
    for (int i = 1; i < points.length; i++) {
      Point p = points[i];
      Point[] tem = new Point[points.length - i];
      System.arraycopy(points, i + 1, tem, 0, tem.length - 1);
      MergeX.sort(tem, p.slopeOrder());

      for (int j = 0; j < tem.length; j++) {
        if (p.slopeTo(tem[j]) == p.slopeTo(tem[j + 1])) {
          pointsinline++;
        } else {
          if (pointsinline >= 4) {
            lines[segments++] = new LineSegment(p, tem[j]);
          }
          pointsinline = 2;
        }
      }
    }

    LineSegment[] realSegments = new LineSegment[segments];
    for (int i = 0; i < segments; i++) {
      realSegments[i] = lines[i];
      System.out.println(realSegments[i]);
    }
  }
}
