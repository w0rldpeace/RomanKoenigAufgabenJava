package com.roman;

import java.util.function.Consumer;

public class SingleLinkedList<T> {

    private Node<T> head;

    //Leerkonstruktor
    public SingleLinkedList(){

    }

    public SingleLinkedList(T data){

        this.head = new Node<>(data);

    }

    public void addFirst(T data){

        Node<T> newNode = new Node<>(data);

        if(head == null){
            this.head = newNode;
            return;
        }

        newNode.setNext(head);
        this.head = newNode;
    }

    public void deleteFirst(){

        if(head != null){
            head = head.getNext();
        }

    }

    public void insertLast(T data){
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node<T> current = head;

        while (current.getNext() != null){
            current = current.getNext();
        }

        // Evtl. unnoetig?
        //data = newNode.getData();

        current.setNext(newNode);

    }
    // Iterirere ich so ueber die Liste?
    public String printList(){

        String output;
        Node<T> currnetNode = this.head;

        output = "Linked List: ";

        System.out.print("Linked List: ");

        while(currnetNode != null){
            output += currnetNode.getData() + " ";
            System.out.print(currnetNode.getData() + " ");
            currnetNode = currnetNode.getNext();
        }

        return output;
    }

    public void traverse(Consumer<Node<T>> consumer){

        Node<T> currnetNode = this.head;

        while(currnetNode != null){
            consumer.accept(currnetNode);
            currnetNode = currnetNode.getNext();
        }
    }

}

