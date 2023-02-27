package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinkedListTests {
    LinkedList linkedList;
    @BeforeEach
    public void beforeEach() {
        linkedList = new LinkedList();
        for (int i = 1; i <= 3; i++) {
            linkedList.add(i);
        }
    }

    @Test
    @DisplayName("LinkedList 생성 테스트")
    public void createLinkedListTest(){
        LinkedList linkedList = new LinkedList();
    }

    @Test
    @DisplayName("boolean add 메서드 테스트")
    public void booleanAddTest () {
        boolean isAdd = linkedList.add(1);
        assertTrue(isAdd);
    }

    @Test
    @DisplayName("boolean contains 메서드 성공 테스트")
    public void containsSuccessTest() {
        boolean hasNode = linkedList.contains(1);
        assertTrue(hasNode);
    }

    @Test
    @DisplayName("boolean contains 메서드 실패 테스트")
    public void containsFailTest() {
        boolean hasNode = linkedList.contains(-1);
        assertTrue(!hasNode);
    }

    @Test
    @DisplayName("LinkedList 사이즈 테스트")
    public void sizeTest() {
        int size = linkedList.size();
        assertEquals(3, size);
    }
}
