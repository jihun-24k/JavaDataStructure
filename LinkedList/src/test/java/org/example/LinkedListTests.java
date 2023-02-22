package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTests {
    LinkedList linkedList;
    @Test
    @BeforeEach
    public void beforeEach() {
        linkedList = new LinkedList();
    }

    @Test
    @DisplayName("LinkedList 생성 테스트")
    public void createLinkedListTest(){
        LinkedList linkedList = new LinkedList();
    }

    @Test
    @DisplayName("add 메서드 테스트")
    public void addTest () {
        boolean isAdd = linkedList.add(1);
        assertTrue(isAdd);
    }

    @Test
    @DisplayName("리스트 사이즈 테스트")
    public void sizeTest() {
        linkedList.add(1);
        linkedList.add(2);
        int size = linkedList.size();
        assertEquals(2, size);
    }
}
