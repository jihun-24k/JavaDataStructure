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
        extendList();
        datum[lastIndex] = o;
        lastIndex++;
    }

    public int size() {
        return lastIndex;
    }

    public int getArrayLen() {
        return datum.length;
    }

    public void extendList(){
        if (lastIndex >= getArrayLen()){
            Object[] newDatum = new Object[getArrayLen() * 2];
            for (int i =0; i < getArrayLen(); i++){
                newDatum[i] = datum[i];
            }
            datum = newDatum;
        }
    }

    public Object get(int idx) {
        return datum[idx];
    }
}
