package collectionsDemos.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dub = new ArrayList();
        al_dub.addAll(al);

        al_dub.removeAll(al);

        // Sort --- Collections.sort()
        Collections.sort(al);

        //Reverse Sort
        Collections.sort(al, Collections.reverseOrder());

        //Shuffling Collections
        Collections.shuffle(al);

    }
}
