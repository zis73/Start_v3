package lab_13;

public class rightTriangle extends Triangle {

    public rightTriangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public void Square() {
        double s;
        if (c > 0 && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))) {
            s = ((a * b) / 2);
            System.out.println("Площадь:" + s);
        }
        else {
            System.out.println("Не верно, квадрат гипотенузы не равен сумме квадратов катетов ");
        }
    }
}