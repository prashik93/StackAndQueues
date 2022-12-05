package com.stackandqueues;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Queue !");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack<Integer> myStack = new MyStack<>();

        boolean beforeAdding = myStack.isEmpty();
        System.out.println("Before pushing Nodes : " + beforeAdding);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);


        INode<Integer> pop = myStack.pop();
        System.out.println("POP method result : " + pop);
        INode<Integer> peak = myStack.peak();
        System.out.println("Peak method result : " + peak);

        int size = myStack.size();
        System.out.println("Size of the Stack is : " + size);

        boolean afterAdding = myStack.isEmpty();
        System.out.println("After pushing Nodes : " + afterAdding);
        myStack.printStack();
    }
}