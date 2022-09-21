package com.company.Linkmylist;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int loldata){
        data = loldata;
        prev=null;
        next=null;
    }
}

public class Doubly_linklist {
    public static void main(String[]arg){
        Node head = new Node(10);
        System.out.println(head.prev);
    }
}
