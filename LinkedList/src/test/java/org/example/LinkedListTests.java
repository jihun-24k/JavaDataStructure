package org.example;

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
    @DisplayName("LinkedList 생성")
    public void createLinkedListTest(){
        LinkedList linkedList = new LinkedList();
    }
}
