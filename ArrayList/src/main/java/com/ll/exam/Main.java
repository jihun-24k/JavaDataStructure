package com.ll.exam;


class Main {
    public static void main(String[] args) {

    }
}

class ArrayList{
    private int lastIndex;
    private Object[] datum;

    ArrayList(){
        this.datum = new Object[10];
        this.lastIndex = 0;
    }

    public void add(Object o) {
        datum[lastIndex] = o;
        lastIndex++;
    }

    public int size() {
        return lastIndex;
    }
}
