package com.company;

import java.util.LinkedList;

public class Linkedlistdemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("kumar");
        ll.add(12);
        ll.add(13);
        ll.add(5);
        System.out.println(ll);
        ll.addFirst(100);
        // poll() also remove the element
       System.out.println( ll.pollLast());
       //offer() also add the element
        ll.offer(8989);

        LinkedList ll2=(LinkedList)ll.clone();
        System.out.println("clone ------------------>link\t\t"+ll2);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);

    }
}
