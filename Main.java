package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

      /*
         1. ArrayList is resizable
          2. Heterogeneous objects are allowed
          3. Data Structure: Growable Array

        Class Package, Constructor, Methods, variables
        -----------------------------------------------

 diff b/w  get() & remove() ?
    1.both will return us the element present in particular
     index.
     2.get() will not remove the particular element from
     the arraylist
      3.remove() will remove the particular element from
      the arraylist

        */

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(3);
        al.add(5);
        al.add (15);
        al.add("Suriyan");
        al.add (true);
        al.add('c');
        al.add(4, "vishal");
      /*  operations  set,get,remove,indexof,contains (nama kitta iruka oru value list irukanu check pana use agum)
      System. out.println(al) ;
        System. out.println(al.contains ("nithya"));
        System.out.println(al.get (0));
        System.out.println(al.get (5) );
        al.set (5, "abgd");
        System.out.println(al.remove (6));
        System.out.println ("index "+al.indexOf("Suriyan")) ;*/
        System.out.println("al2 list using al \t"+al);

        //arraylist la easy oru list vachi innoru list create panikalam using "addAll"
        ArrayList al2=new ArrayList();
        al2.addAll(al);
        System.out.println("al2 list using al \t"+al2);

        //values namaku enga venummo anga place panikalm using "addAll(index,listname)"

        ArrayList al3= new ArrayList();
        al3.add("Banglore");
        al3.add("Chennai");
        al3.add("Ranipet");
        al3.add("Banglore");
        al3.add("Vellore");
        System.out.println("index of Banglore"+al3.indexOf("Banglore"));
        System.out.println("last index of Banglore"+al3.lastIndexOf("Banglore"));
        System.out.println("before add with al"+al3);
        al3.addAll(1,al);
        System.out.println("after add with al"+al3);
        al3.removeAll(al);
        System.out.println("al3 after removeAll()"+al3);

        //sublist use pani namaku entha index irunthu entha index vara venum nu kuduthukalam
        List al4=al3.subList(0,4);
        System.out.println("al4 lists"+al4);
        al.clone();
        System.out.println("clone------------------------>"+al);
        al.clear();
        System.out.println(al4);

    }
}
