package com.company.Linkmylist;
class Nodecircular{
    int data ;
    Nodecircular next;
    Nodecircular(int datame){
        data = datame;
        next = null;
    }
}

public class Circularlinklist {
static Nodecircular addfront(Nodecircular head , int data){
    Nodecircular temp = new Nodecircular(data);
    if(head == null )return  temp;
    else {
        temp.next = head;
        head.next = temp;
        head = temp;
    }


    return  head;
}
    public static void main(String[]args){
    Nodecircular head = addfront(null ,10);
    head = addfront(head , 20);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);

    }
}
