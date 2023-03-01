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
    @DisplayName("void add 메서드 테스트")
    public void voidAddTest() {
        linkedList.add(2, 4);
        int index = linkedList.indexOf(4);
        assertEquals(2, index);
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
    @DisplayName("int indexOf 메서드 성공 테스트")
    public void indexOfSuccessTest(){
        int index = linkedList.indexOf(3);
        assertEquals(2, index);
    }

    @Test
    @DisplayName("int indexOf 메서드 실패 테스트")
    public void indexOfFailTest() {
        int index = linkedList.indexOf(5);
        assertEquals(-1, index);
    }


    @Test
    @DisplayName("LinkedList 사이즈 테스트")
    public void sizeTest() {
        int size = linkedList.size();
        assertEquals(3, size);
    }

    @Test
    @DisplayName("Object get 메서드 테스트")
    public void getTest() {
        int value = linkedList.get(2);
        assertEquals(3, value);
    }

    @Test
    @DisplayName("Object remove 메서드 테스트")
    public void removeTest() {
        int value = linkedList.remove(2);
        assertEquals(3, value);
        assertEquals(2, linkedList.size());
    }
}
