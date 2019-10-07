package lab_13;

public class Main {
    public static void main(String[] args) {
        Triangle treug = new Triangle(6,7,11);
        treug.Print();
        treug.Perimeter();
        treug.Square();
        rightTriangle triangle = new rightTriangle(3,4,5);
        System.out.println("-----------");
        triangle.Print();
        triangle.Square();
        triangle.Perimeter();
    }
}
