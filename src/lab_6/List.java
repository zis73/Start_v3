package lab_6;

public class List {
    static Node first;
    static Node last;

    public void Add(int a) {
        Node newNode = new Node(a);
        if (first == null) {
            first = newNode;
            last = newNode;
            newNode.next = null;
        } else {
            newNode.next = last;
            last = newNode;
        }
    }

    public void RemoveLast() {
        //node.next.a--;
    }

    public void Count() {

    }
    public void Print(){
        while (last != null){
            System.out.println(last);
            last.next = last;
            System.out.println(last);
        }
    }
}
