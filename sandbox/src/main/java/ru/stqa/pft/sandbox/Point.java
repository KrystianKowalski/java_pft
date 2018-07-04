package ru.stqa.pft.sandbox;

public class Point {
   // class body
   public double x;
   public double y;

   // constructor
   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   //method calculating distace between two points
   public double distance(Point p1) {
      double dx = this.x - p1.getX();
      double dy = this.y - p1.getY();

      return Math.sqrt((dx * dx)+ (dy * dy));
   }

}
