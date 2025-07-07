package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("amol");
        al.add("vishal");
        al.add("swechha");
        al.add("purnima");
        al.add(12);
        al.add(12.34);
        al.add('b');
        al.add(true);


        System.out.println(al);
        System.out.println(al.size());



    }
}
