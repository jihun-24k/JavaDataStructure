package com.ll.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HashMapTest {
    HashMap<String, Integer> hs1;
    HashMap<String, Object> hs2;

    @BeforeEach
    void beforeEach() {
        hs1 = new HashMap<>();
        hs2 = new HashMap<>();
    }

    @Test
    void putTest1() {
        hs1.put("홍길동", 1);
    }

    @Test
    void putTest2() {
        hs2.put("홍길순", "배고프다");
    }

    @Test
    void getTest1() {
        hs1.put("홍길동", 1);
        int rs = hs1.get("홍길동");

        assertEquals(rs, 1);
    }

    @Test
    void getTest2() {
        hs2.put("홍길순", "배고프다");
        Object rs = hs2.get("홍길순");

        assertEquals(rs, "배고프다");
    }

    @Test
    void getIndexOfTest(){
        hs1.put("홍길동", 1);
        hs1.put("홍길순", 2);
        int rs = hs1.getIndexOf("홍길동");
        int rs2 = hs1.getIndexOf("홍길빵");

        assertEquals(rs,0);
        assertEquals(rs2, -1);
    }

    @Test
    void modifyTest(){
        hs1.put("홍길동", 1);
        hs1.put("홍길동", 2);

        int rs = hs1.get("홍길동");
        assertEquals(rs,2);
    }

    @Test
    void removeTest(){
        hs1.put("홍길동", 1);
        hs1.put("홍길순", 2);
        hs1.put("홍길빵", 3);

        hs1.remove("홍길순");

        assertEquals(0,hs1.getIndexOf("홍길동"));
        assertEquals(1,hs1.getIndexOf("홍길빵"));
        assertEquals(-1,hs1.getIndexOf("홍길순"));
    }
}