package ru.stqa.pft.sandbox;

public class Point {
   private double[] p1 = new double[2];
   private double[] p2 = new double[2];


   public Point(double p1[], double p2[]) {
      this.p1[0] = p1[0];
      this.p1[1] = p1[1];
      this.p2[0] = p2[0];
      this.p2[1] = p2[1];
   }

   public double distance() {
      double dx;
      double dy;
      dx = p2[0] - p1[0];
      dy = p2[1] - p1[1];

      return Math.sqrt((dx * dx) + (dy * dy));
   }

}
