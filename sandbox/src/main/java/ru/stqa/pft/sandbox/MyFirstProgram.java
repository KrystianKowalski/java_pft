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

      Point p = new Point(2, 3, 7, 9);
      System.out.println(p.distance());
   }

   public static void hello(String somebody) {
      System.out.println("Hello, " + somebody + "!");
   }


}
