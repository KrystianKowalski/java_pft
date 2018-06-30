package ru.stqa.pft.sandbox;

public class MyFirstProgram {

   public static void main(String[] args) {
      hello("world");
      hello("user");
      hello("Krystian");

      Square s = new Square(5);
      System.out.println("Square sqaure area of " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4, 6);
      System.out.println("Rectangle sqaure area of " + r.a + " & " + r.b + " = " + r.area());

      double[] p1 = {2, 3};
      double[] p2 = {7, 9};
      Point p = new Point(p1, p2);
      System.out.println(p.distance());
   }

   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }


}
