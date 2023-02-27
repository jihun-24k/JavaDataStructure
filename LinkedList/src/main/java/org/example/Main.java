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
}
