package com.datastructures.linkedlist;

class Node{
    public int data;
    public Node next;
    public Node prev;

    public void displayNodeDate(){
        System.out.println(" data is "+ data);
    }

}

public class DoublyLinkedListOperation {

    private int data;
    private Node head;
    private Node tail;

//insert a node at the start of the list
    public void insertFirst(int data){

            Node newNode = new Node();
            newNode.data = data;
            newNode.next = head;
            newNode.prev = tail;

    }

}
