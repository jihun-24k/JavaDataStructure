package com.ll.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HashMapTest {
    HashMap<String, Integer> hs1;
    HashMap<String, Object> hs2;

    @BeforeEach
    void beforeEach(){
        hs1= new HashMap<>();
        hs2= new HashMap<>();
    }

    @Test
    void putTest1(){
        hs1.put("홍길동",1);
    }

    @Test
    void putTest2(){
        hs2.put("홍길순","배고프다");
    }

}
