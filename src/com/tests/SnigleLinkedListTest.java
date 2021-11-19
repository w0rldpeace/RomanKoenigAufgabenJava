package com.tests;

import com.roman.Node;
import com.roman.SingleLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SnigleLinkedListTest {
    SingleLinkedList<Integer> list;
    ArrayList<Node<Integer>> arrayList;

    @BeforeEach
    public void init(){
        arrayList = new ArrayList<>();
        list = new SingleLinkedList<>();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
    }

    @Test
    public void testAdd(){

        //New Consumer, erkennt automatisch, weil Functional Interface
        list.traverse(integerNode -> {
            System.out.println(integerNode.getData());

            arrayList.add(integerNode);
        });

        assertEquals(1, arrayList.get(0).getData());
        assertEquals(2, arrayList.get(1).getData());
        assertEquals(3, arrayList.get(2).getData());
        assertEquals(4, arrayList.get(3).getData());
    }

    @Test
    public void testDeleteFirst(){

        list.deleteFirst();
        //New Consumer, erkennt automatisch, weil Functional Interface
        list.traverse(integerNode -> {
            System.out.println(integerNode.getData());

            arrayList.add(integerNode);
        });
        assertEquals(2, arrayList.get(0).getData());
        assertEquals(3, arrayList.get(1).getData());
        assertEquals(4, arrayList.get(2).getData());
    }

    @Test
    public void testInsertLast(){

        list.insertLast(5);
        //New Consumer, erkennt automatisch, weil Functional Interface
        list.traverse(integerNode -> {
            System.out.println(integerNode.getData());

            arrayList.add(integerNode);
        });
        assertEquals(1, arrayList.get(0).getData());
        assertEquals(2, arrayList.get(1).getData());
        assertEquals(3, arrayList.get(2).getData());
        assertEquals(4, arrayList.get(3).getData());
        assertEquals(5, arrayList.get(4).getData());
    }

    @Test
    public void testIterate(){

        assertEquals("Linked List: 1 2 3 4 ", list.printList());
    }
}
