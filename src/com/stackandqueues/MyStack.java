package com.stackandqueues;

public class MyStack<K> {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList<>();
    }

    public int size() {
        return myLinkedList.size();
    }

    public boolean isEmpty() {
        return myLinkedList.isEmpty();
    }

    public INode<K> peak() {
        return myLinkedList.head;
    }

    public INode<K> pop () {
        int size = myLinkedList.size();
        if(size > 0) {
            int count = 1;
            while (count < size) {
                count++;
                myLinkedList.pop();
            }
            return myLinkedList.pop();
        }
        return null;
    }

    public void push(INode<K> myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        System.out.print("Stack" + " ");
        myLinkedList.printMyNodes();
    }
}
