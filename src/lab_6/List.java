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
        Node remove = null;
        if (last.next != null) {
            remove = last;
            last = last.next;
        }
        remove.next = null;
    }


    public void Count() {
        //8 должен вывести
        int count = 0;
        Node _last = last;
        while (_last != null) {
            _last = _last.next;
            count++;
        }
        System.out.println("Общее кол-во ячеек:" + count);
    }

    public void Print() {
        Node _last = last;
        while (_last != null) {
            System.out.println(_last.a);
            _last = _last.next;
        }
    }
}
