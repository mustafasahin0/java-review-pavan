package collectionsDemos.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        //Add new elements to the arrayList
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);

        //size()
        System.out.println("Number of elements ion array list " + al.size());

        //remove
        al.remove(1);
        al.remove("Welcome");

        //insert a new element

        //add(index, object)
        al.add(2, "Python");

        //retrive specific element
        al.get(2);

        //change element/replace
        al.set(2, "C#");

        //search - contains() - Return true or False
        al.contains("C#");

        //isEmpty() - Return boolean
        al.isEmpty();

        //1) for loop
        System.out.println("Reading Elements Using For Loop");
        for (int i = 0; i <= al.size(); i++) {
            System.out.println(al.get(i));
        }

        //2) for each loop
        System.out.println("Reading Elements Using For Each Loop");
        for (Object e : al) {
            System.out.println(e);
        }

        //3) iterator()
        System.out.println("Reading Elements Using Iterator Method");
        Iterator it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());  //printing the element and move to the next
        }

    }
}
