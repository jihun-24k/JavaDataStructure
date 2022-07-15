package com.ll.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
