package lab_6;

public class Main {
    public static void main(String[] args) {
        // Node node = new Node();
        List list = new List();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Print();
        list.Count();
        list.Add(12);
        list.Print();
        list.Count();
        list.RemoveLast();
        list.Print();
        list.Count();
        list.RemoveLast();
        list.Print();
        list.Count();
        list.RemoveLast();
        list.Print();
        list.Count();
    }
}
