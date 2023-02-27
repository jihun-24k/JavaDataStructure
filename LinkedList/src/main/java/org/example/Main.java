package org.example;

public class Main {

    public static void main(String[] args) {

    }
}

class LinkedList {
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public boolean add(int i) {
        size++;
        return true;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int i) {
        return true;
    }
}

class Node {
    private int element;
    public Node previous;
    public Node next;
    public Node(Node prev, int element, Node next) {
        this.previous = prev;
        this.element = element;
        this.next = next;
    }
}
