package com.stackandqueues;

public class MyQueue<K> {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public void enqueue(INode<K> myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }
}
