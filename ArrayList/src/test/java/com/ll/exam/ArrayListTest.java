package com.ll.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
