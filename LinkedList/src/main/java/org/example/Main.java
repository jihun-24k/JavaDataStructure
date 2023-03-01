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
        linkLast(e);
        return true;
    }


    public void add(int index, int e) {
        if (isPossibleIndex(index)){
            if (size == index - 1)
                linkLast(e);
            else
                linkBefore(e, node(index));
        }
    }

    private Node node(int index) {
        Node findNode = first;
        while (index > 0) {
            findNode = findNode.next;
            index--;
        }
        return findNode;
    }

    private void linkBefore(int e, Node node) {
        Node prev = node.previous;
        Node newNode = new Node(prev, e, node);
        node.previous = newNode;
        if (prev == null)
            first = newNode;
        else
            prev.next = newNode;
        size++;
    }

    private boolean isPossibleIndex(int index) {
        return index >= 0 && index < size;
    }

    private void linkLast(int e) {
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
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int e) {
        return indexOf(e) >= 0;
    }

    public int indexOf(int e) {
        int index = 0;
        for (Node node = first; node != null; node = node.next) {
            if (node.element == e)
                return index;
            index++;
        }
        return -1;
    }

    public Node get(int index) {
        return node(index);
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
