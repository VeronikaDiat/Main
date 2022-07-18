package Lesson4;

public class Circle {
    static double PI = 3.14;
    public static void CalculateArea (double radius) {
    double area = PI * (radius*radius);
    System.out.println("Plosha cruga" + " "+ area);

    }

    public static void CalculateLength(double radius) {

        double length = PI * 2 * radius;
        System.out.println("Dovgina cruga" + " "+ length);

    }
}
