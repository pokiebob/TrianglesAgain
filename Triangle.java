public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public static void main(String[] args) {
    Triangle tri1 = new Triangle( new Point(-1, -1), new Point(0, 1), new Point(1 , -1));
    Triangle tri2 = new Triangle(-2, -2, 0, 2, 2, -3);
  }

}
