package com.ll.exam;

import java.util.HashSet;
import java.util.Set;

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
        this.keys = new Object[100];
        this.values = new Object[100];
    }

    public void put(K key, V value) {
        int index = getIndexOf(key);
        if (index == -1){
            keys[size] = key;
            values[size] = value;
            size++;
        }
        else{
            values[index] = value;
        }
    }

    public V get(K key){
        int index = getIndexOf(key);
        if (index == -1){
            return null;
        }
        return (V)values[index];
    }

    public int getIndexOf(K key) {
        for (int i = 0; i < size; i++){
            if (keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public void remove(K key) {
        int index = getIndexOf(key);
        for (int i = index; i < size; i++){
            keys[i] = keys[i+1];
            values[i] = values[i+1];
        }
        keys[size] = null;
        values[size] = null;
        size--;
    }

    public int size(){
        return this.size;
    }

    public Set<V> keySet() {
        Set<V> keySet = new HashSet<>();
        for (int i = 0; i< size; i++){
            keySet.add((V) keys[i]);
        }
        return keySet;
    }
}
