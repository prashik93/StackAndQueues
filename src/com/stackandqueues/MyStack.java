package com.stackandqueues;

public class MyStack<K> {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public void push(INode<K> myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }
}
