public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  //construct a point given a point  (redundant , just provides flexibility)
  public Point(Point p){
    x= p.x;  //private access in the same file is allowed!
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other) {
    return Math.sqrt((other.getX() - x) * (other.getX() - x) + (other.getY() - y) * (other.getY() - y));
  }

  public boolean equals(Point other) {
    return x == other.getX() && y == other.getY();
  }

  public static void main(String[] args) {
    // Point pnt = new Point(0, 0);
    // Point pnt2 = new Point(2, 0);
    // System.out.println(pnt.getX());
    // System.out.println(pnt.distanceTo(pnt2));
    // System.out.println(pnt.equals(pnt2));
    // System.out.println(pnt.equals(pnt));
  }

}
