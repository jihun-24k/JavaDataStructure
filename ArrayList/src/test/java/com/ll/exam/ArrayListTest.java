package com.ll.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    private ArrayList arr;

    @BeforeEach
    void BeforeEach(){
        arr = new ArrayList();
    }
    @Test
    public void ArrayListTest(){
        ArrayList arrayList = new ArrayList();
    }

    @Test
    public void addTestInt(){
        arr.add(100);
    }

    @Test
    public void addTestString(){
        arr.add("안녕");
    }

    @Test
    public void sizeTest(){
        arr.add(1111);
        int rs = arr.size();
        assertEquals(rs, 1);
    }

    @Test
    public void getArrayLenTest(){
        for (int i = 0; i<10; i++)
            arr.add(100);

        int rs = arr.getArrayLen();

        assertEquals(rs, 10);
    }

    @Test
    public void extendListTest(){
        for (int i = 0; i<10; i++)
            arr.add(100);
        int rs1 = arr.getArrayLen();

        arr.add(200);
        int rs2 = arr.getArrayLen();
        assertEquals(rs1, 10);
        assertEquals(rs2, 20);
    }

    @Test
    public void getTest(){
        for (int i = 0; i<10; i++)
            arr.add(i*11);
        Object rs = arr.get(2);

        assertEquals(rs, 22);
    }

    @Test
    public void addAtTest(){
        for (int i = 0; i<3; i++)
            arr.add(i*11);

        arr.addAt(3, 1);

        assertEquals(arr.get(0), 0);
        assertEquals(arr.get(1),3);
        assertEquals(arr.get(2),11);
        assertEquals(arr.get(3),22);
    }

    @Test
    public void removeTest(){
        arr.add(100);
        arr.add(200);

        arr.remove(1);

        assertEquals(arr.get(1), 200);
    }

    @Test
    public void showAllValuesTest(){
        arr.add(100);
        arr.add(200);
        arr.add(300);

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        arr.showAllValues();

        String rs = output.toString();

        TestUtil.clearSetOutToByteArray(output);

        assertTrue(rs.contains("== 전체 데이터 출력 =="));
        assertTrue(rs.contains("0 : 100"));
        assertTrue(rs.contains("1 : 200"));
        assertTrue(rs.contains("2 : 300"));

    }

    @Test
    public void containsTest(){
        // cotains는 리스트 안에 찾고자 하는 객체가 있는지 판별하는 메서드

        arr.add(100);
        boolean rs1 = arr.contains(100);
        boolean rs2 = arr.contains(200);

        assertEquals(rs1, true);
        assertEquals(rs2, false);
    }

    @Test
    public void setTest(){
        arr.add(100);
        arr.add(200);
        arr.add(300);

        arr.set(1,222);

        assertEquals(arr.get(0),100);
        assertEquals(arr.get(1), 222);
        assertEquals(arr.get(2),300);
    }
}


