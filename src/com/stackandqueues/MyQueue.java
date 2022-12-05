package com.stackandqueues;

public class MyQueue<K> {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public int size() {
        return myLinkedList.size();
    }

    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }

    public INode<K> dequeue() {
        int size = size();
        if(size > 0) {
            return myLinkedList.pop();
        }
        return null;
    }

    public void enqueue(INode<K> myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        System.out.print("Queue" + " ");
        myLinkedList.printMyNodes();
    }
}
