package lab_13;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        doIt();
    }

    public static void doIt() {
        Perimeter(3, 4, 1);
        Square(3, 5, 4);
    }

    public static void Perimeter(double a, double b, double c) {
        double P;
        P = a + b + c;
        System.out.println("Периметр: " + P);

    }

    public static void Square(double a, double b, double c) {
        double S;
        double p = (a + b + c) / 2;
        S = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        System.out.println("Площадь: " + S);
    }
}
//    public static void Vvod() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите длину a: ");
//        int a = scan.nextInt();
//        System.out.println("Введите длину b: ");
//        int b = scan.nextInt();
//        System.out.println("Введите длину c: ");
//        int c = scan.nextInt();
//        Perimetr(a, b, c);
//        Square(a, b, c);
//    }