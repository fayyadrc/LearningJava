import java.lang.Math;

class Point {

  // Private fields
  private int x;
  private int y;

  // Default Constructor
  public Point() {
    // Implement the function
    this.x = 0;
    this.y = 0;
  }

  // Parameterized Constructor
  public Point(int x, int y) { 
    // Implement the function
    this.x = x;
    this.y = y;
    
  }


  // distance from this point to origin (0,0)
  public double distance() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

  // distance from this point to (x1, y1)
  public double distance(int x1, int y1) {
    double xDiff = x1 - this.x;
    double yDiff = y1 - this.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

}

class Demo {

  public static void main(String args[]) {
    Point p1 = new Point(5, 5);
    System.out.println(p1.distance());
    System.out.println(p1.distance(2, 1));
  }

}