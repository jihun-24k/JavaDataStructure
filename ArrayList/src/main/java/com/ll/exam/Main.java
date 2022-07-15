package com.ll.exam;


class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);
        // 출력 => 배열의 크기가 증가되었습니다. 2 => 4

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.remove(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);
        // 출력 => 배열의 크기가 증가되었습니다. 4 => 8

        System.out.println("al.get(3) + al.get(4) : " + ((int)al.get(3) + (int)al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (((Integer)al.get(3)).intValue() + ((Integer)al.get(4)).intValue()));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.addAt(700, 1);
        al.addAt(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/

        al.set(1,777);
        System.out.println(al.get(1));
        System.out.println(al.contains(777));
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

    public void addAt(Object o, int idx) {
        extendList();
        for (int i = lastIndex + 1; i > idx; i--){
            datum[i] = datum[i-1];
        }
        datum[idx] = o;
        lastIndex++;
    }

    public void remove(int idx) {
        for (int i = idx; i < lastIndex - 1; i++){
            datum[i] = datum[i + 1];
        }
        datum[lastIndex] = null;
        lastIndex--;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for (int i = 0; i<lastIndex; i++){
            System.out.printf("%d : %d\n",i, datum[i]);
        }
    }

    public boolean contains(Object data) {
        for (int i= 0; i<lastIndex; i++) {
            if (datum[i].equals(data))
                return true;
        }
        return false;
    }

    public void set(int idx, Object data) {
        datum[idx] = data;
    }
}
