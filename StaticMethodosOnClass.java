package application;
import java.util.Locale;
import java.util.Scanner;
public class StaticMethodosOnClass {
public static final double PI = 3.14159;
public static void main(String[] args) {
/* circunferência e do volume de uma esfera
 usando a class Calculator do Pacote Util,
 
import util.Calculator;
Calculator calc = new Calculator();
System.out.print("Enter radius: ");
double radius = sc.nextDouble();
double c = calc.circumference(radius);
double v = calc.volume(radius);
System.out.printf("Circumference: %.2f%n", c);
System.out.printf("Volume: %.2f%n", v);
System.out.printf("PI value: %.2f%n", calc.PI);

para um raio */

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius: ");
double radius = sc.nextDouble();
double c = circumference(radius);
double v = volume(radius);
System.out.printf("Circumference: %.2f%n", c);
System.out.printf("Volume: %.2f%n", v);
System.out.printf("PI value: %.2f%n", PI);
sc.close();
}
public static double circumference(double radius) {
return 2.0 * PI * radius;
}
public static double volume(double radius) {
return 4.0 * PI * radius * radius * radius / 3.0;
}
}
