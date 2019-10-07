package lab_13;

public class Triangle {

    static int a;
    static int b;
    static int c;

    public Triangle(int a, int b, int c) {
        Triangle.a = a;
        Triangle.b = b;
        Triangle.c = c;
    }
    public static void Print(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public void Square() {
        double S;
        double p;
        if (a < c && b < c && c > 0 && c < (a + b)) {
            p = (a + b + c) / 2;
            S = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
            System.out.println("Площадь: " + S);
        } else {
            System.out.println("Введите А > C, В > C и больше 0");
        }

    }
    public void Perimeter(){
        double P;
        P = a + b + c;
        System.out.println("Периметр: " + P);
    }
}

