package com.stackandqueues;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue !");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack<Integer> myStack = new MyStack<>();

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        myStack.printStack();
    }
}