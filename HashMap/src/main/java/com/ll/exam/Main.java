package com.ll.exam;

public class Main {
    public static void main(String[] args) {

    }
}

class HashMap<K, V>{
    private Object[] keys;
    private Object[] values;
    private int size;

    HashMap(){
        this.size = 0;
        this.keys = new Object[3];
        this.values = new Object[3];
    }

    public void put(K key, V value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }
}
