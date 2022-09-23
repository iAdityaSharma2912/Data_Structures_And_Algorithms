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
    static Node addfront(Node head , int value){
       Node  temp = new Node(value);
        if(head == null) {
          return temp;
       }
        else {
            temp.next=head;
            head.prev = temp;
        }


        return temp;
    }

    static Node remfront(Node head){
        Node temp  = head.next;
        head = temp;
        return head;
    }

    static Node addend(Node head , int val){
        if(head== null){
            return null;
        }

        Node curr = head;
        while(curr.next!=null){
            curr= curr.next;
        }
        Node temp = new Node(val);
        temp.prev = curr;
        curr.next = temp;
        return head;
    }


    static Node remendlink(Node head){
        if( head == null ){
            return null;
        }
        if( head.next == null ){
            return null;
        }
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr = curr.prev;
        curr.next= null;
        return head;
    }

    static  void traverselink(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }

    static Node reverse(Node head){

        return  head;
    }

    public static void main(String[]arg){
        Node head = new Node(10);
         head = addfront(head , 20);
         head = addfront(head ,30);
         head = addfront(head ,40);
         head = addfront(head , 50);
         head = addfront(head ,60);
        head =  addfront(head , 100);
        head = addend(head , 0);
        head = remfront(head);
        head = remendlink(head);




        traverselink(head);


    }
}
