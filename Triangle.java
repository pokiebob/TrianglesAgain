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

  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public double getArea() {
    double s = this.getPerimeter() / 2;
    return Math.sqrt(
            s * (s - v1.distanceTo(v2))
             * (s - v2.distanceTo(v3))
             * (s - v3.distanceTo(v1)));
  }

  public String classify() {
      double side1 = ((double) Math.round(v1.distanceTo(v2) * 10000)) / 10000;
      double side2 = ((double) Math.round(v2.distanceTo(v3) * 10000)) / 10000;
      double side3 = ((double) Math.round(v3.distanceTo(v1) * 10000)) / 10000;
      if (side1 == side2 || side1 == side3 || side2 == side3) {
          if (side1 != side2 || side1 != side3 || side2 != side3) {
              return "isosceles";
          }
          return "equilateral";
      }
      return "scalene";
  }

  public String toString() {
    return "v1(" + v1.getX() + ", " + v1.getY() + ") "
     + "v2(" + v2.getX() + ", " + v2.getY() + ") "
      + "v3(" + v3.getX() + ", " + v3.getY() + ")";
  }

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    } else if (index == 1) {
      v2 = newP;
    } else {
      v3 = newP;
    }
  }

  public static void main(String[] args) {
    // Triangle tri1 = new Triangle( new Point(-1, -1), new Point(0, 1), new Point(1 , -1));
    // Triangle tri2 = new Triangle(-2, -2, 0, 2, 2, -3);

    // System.out.println(tri1.getPerimeter());
    // System.out.println(tri2.getPerimeter());
    // System.out.println(tri1.getArea());
    // System.out.println(tri2.getArea());
    // System.out.println(tri1.classify());
    // System.out.println(tri2.classify());
    // System.out.println(tri1.toString());
    // System.out.println(tri2.toString());
    // tri1.setVertex(0, new Point(33, 66));
    // tri2.setVertex(2, new Point(-234, 3));
    // System.out.println(tri1.toString());
    // System.out.println(tri2.toString());
  }

}
