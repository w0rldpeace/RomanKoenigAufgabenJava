package com.roman;

public class DoubleNode<T> {
    //

    private T data;
    private DoubleNode<T> prev;
    private DoubleNode<T> next;

    public DoubleNode(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode<T> prev) {
        this.prev = prev;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    public void displayNodeData(){
        System.out.print(data + " -> ");
    }
}
