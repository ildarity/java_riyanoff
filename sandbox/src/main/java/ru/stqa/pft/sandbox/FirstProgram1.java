package ru.stqa.pft.sandbox;

public class FirstProgram1 {

 public static void main (String[] args) {
   hello ("world");
   hello ("Ildar");

   Square s = new Square (5);
   System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


   Rectangle r = new Rectangle(5, 9);
   System.out.println("Площадь квадрата со стороной " + r.a + " и " + r.b + " = " + r.area());
   }

 public static void hello(String somebody) {
   System.out.println("Hello, " + somebody + "!");
 }

}