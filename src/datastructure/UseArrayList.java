package datastructure;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> alist=new ArrayList<String>();

        alist.add("John");
        alist.add("Bonny");
        alist.add("Steve");
        alist.add("Brett");

        System.out.println("Original ArrayList: "+ alist);


        System.out.println("************************************");

        // Add Rocky 5rd position
        alist.add(3, "Rocky");

        System.out.println("After adding: " + alist);

        System.out.println("************************************");

        //Remove Brett
        alist.remove("Steve");
        alist.remove("Bonny");
        System.out.println("After removing: "+ alist);










    }

}
