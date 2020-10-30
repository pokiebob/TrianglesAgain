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

  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }

  public double getPerimeter() {
    return distance(v1.getX(), v1.getY(), v2.getX(), v3.getY()) + distance(v2.getX(), v2.getY(), v3.getX(), v3.getY()) + distance(v3.getX(), v3.getY(), v1.getX(), v1.getY());
  }

  public double getArea() {
    double s = this.getPerimeter();
    return Math.sqrt(
            s * (s - distance(v1.getX(), v1.getY(), v2.getX(), v2.getY()))
             * (s - distance(v2.getX(), v2.getY(), v3.getX(), v3.getY()))
             * (s - distance(v3.getX(), v3.getY(), v1.getX(), v1.getY())));
  }

  public String classify() {
      double side1 = (double) ( (int) (distance(v1.getX(), v1.getY(), v2.getX(), v2.getY()) * 10000) / 10000);
      double side2 = (double) ( (int) (distance(v2.getX(), v2.getY(), v3.getX(), v3.getY()) * 10000) / 10000);
      double side3 = (double) ( (int) (distance(v3.getX(), v3.getY(), v1.getX(), v1.getY()) * 10000) / 10000);
      if (side1 == side2 || side1 == side3 || side2 == side3) {
          if (side1 != side2 || side1 != side3 || side2 != side3) {
              return "isosceles";
          }
          return "equilateral";
      }
      return "scalene";
  }

  public static void main(String[] args) {
    Triangle tri1 = new Triangle( new Point(-1, -1), new Point(0, 1), new Point(1 , -1));
    Triangle tri2 = new Triangle(-2, -2, 0, 2, 2, -3);

    System.out.println(tri1.getPerimeter());
    System.out.println(tri2.getPerimeter());
    System.out.println(tri1.getArea());
    System.out.println(tri2.getArea());
    System.out.println(tri1.classify());
    System.out.println(tri2.classify());
  }

}
