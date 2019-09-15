package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> alist = new ArrayList<String>();
        LinkedList linkedList = new LinkedList();

        alist.add("John");
        alist.add("Bonny");
        alist.add("Steve");
        alist.add("Brett");
        alist.add("Rocky");


        for (int i = 0; i < alist.size(); i++) {

            System.out.println(alist.get(i));

        }
        System.out.println("*****Remove Name****");

        alist.remove(2);
        for (int j = 0; j < alist.size(); j++) {
            System.out.println(alist.get(j));


        }

        System.out.println("********GET PEEK & GET ELEMENT*********");

        linkedList.add("BMW");
        linkedList.add("Audi");
        linkedList.add("Honda");

        Iterator iterator = linkedList.iterator();

        System.out.println(linkedList.peek());
        System.out.println(linkedList.element());

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
            System.out.println();


        }

    }


