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
    public void size(){
        arr.add(1111);
        int rs = arr.size();
        assertEquals(rs, 1);
    }
}
