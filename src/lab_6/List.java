package lab_6;

public class List {
    static Node first;
    static Node last;

    public void Add() {
        Node newNode = new Node();
        if (first == null) {
            newNode.next = null;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode.next;
           // newNode.next тут изменить ;
            last = newNode;
        }
        System.out.println("dfdf");
    }

    public void RemoveLast() {
        //node.next.a--;
    }

    public void Count() {

    }
}
