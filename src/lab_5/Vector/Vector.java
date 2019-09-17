package lab_5.Vector;

public class Vector {
    public static void main(String[] args) {
        Rect rect = new Rect(new Vector2(4, 9), new Vector2(6, 4));

        rect.Square();
        rect.Perimetr();
    }

    public static class Vector2 {
        int x;
        int y;

        public Vector2(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static class Rect {

        public int a;
        Vector2 vector;
        Vector2 secondVector;

        public Rect(Vector2 vector, Vector2 secondVector) {
            this.vector = vector;
            this.secondVector = secondVector;
        }

        public void Perimetr() {
            int p;
            int a = secondVector.x - vector.x;
            int b = vector.y - secondVector.y;
            p = 2 * (a + b);
            System.out.println("Периметр:" + p);
        }


        public void Square() {
            int s;
            int a = secondVector.x - vector.x;
            int b = vector.y - secondVector.y;
            s = a * b;
            System.out.println("Площадь:" + s);
        }
    }
}
