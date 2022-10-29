package util;
public class Calculator {
  /* 
metodos estaticos para que não precise instanciar o objeto na classe principal 
public static final double PI = 3.14159;
public static double circumference(double radius) {
return 2.0 * PI * radius;
}
public static double volume(double radius) {
return 4.0 * PI * radius * radius * radius / 3.0;
}*/
  
  
public final double PI = 3.14159;
public double circumference(double radius) {
return 2.0 * PI * radius;
}
public double volume(double radius) {
return 4.0 * PI * radius * radius * radius / 3.0;
}
}
