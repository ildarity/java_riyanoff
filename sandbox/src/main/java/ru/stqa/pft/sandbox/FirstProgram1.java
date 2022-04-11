package ru.stqa.pft.sandbox;

public class FirstProgram1 {

 public static void main (String[] args) {
   hello ("world");
   hello ("Ildar");

   double l = 5;
   System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

   double a = 5;
   double b = 9;
   System.out.println("Площадь квадрата со стороной " + a + " и " + b + " = " + area(a, b));
   }

 public static void hello(String somebody) {
   System.out.println("Hello, " + somebody + "!");
 }

 public static double area (double len) {
   return len * len;
 }
 public static double area (double a, double b) {
   return a * b;
 }
}