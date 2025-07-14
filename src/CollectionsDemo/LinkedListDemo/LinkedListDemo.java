package CollectionsDemo.LinkedListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {




        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("vishal");
        ll.add("swechha");
        ll.add("purnima");
        ll.add("abhinaya");
        ll.add("pooja");
        ll.add("sayali");
        ll.add("anirudha");
        ll.add("anirudha");

        System.out.println(ll);
        ll.addFirst("first");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }
}
