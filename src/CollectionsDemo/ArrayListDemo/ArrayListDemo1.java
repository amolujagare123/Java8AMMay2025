package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("amol");
        al.add("vishal");
        al.add("swechha");
        al.add("purnima");

        System.out.println(al);
        System.out.println(al.size());

        al.add("purnima");
        al.add("purnima");
        al.add("purnima");

        System.out.println(al);
        System.out.println(al.size());

        al.remove(2);
        al.remove(3);

        System.out.println(al);
        System.out.println(al.size());

    }
}
