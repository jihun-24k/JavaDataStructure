package org.example;

public class Main {

    public static void main(String[] args) {

    }
}

class LinkedList {
    private int size;
    private Node first;
    private Node last;

    public LinkedList() {
        this.size = 0;
    }

    public boolean add(int e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (first == null){
            first = newNode;
        }
        else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int e) {
        for (Node node = first; node != null; node = node.next) {
            if (node.element == e)
                return true;
        }
        return false;
    }
}

class Node {
    int element;
    Node previous;
    Node next;
    public Node(Node prev, int element, Node next) {
        this.previous = prev;
        this.element = element;
        this.next = next;
    }
}
