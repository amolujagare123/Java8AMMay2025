package CollectionsDemo.VectorsDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        System.out.println("size="+v.size()); // 0
        System.out.println("capacity="+v.capacity()); // 10

        v.add("amol");
        v.add("vishal");
        v.add("swechha");
        v.add("purnima");
        v.add("abhinaya");
        v.add("pooja");
        v.add("sayali");
        v.add("anirudha");
        v.add("anirudha");
        v.add("anirudha");
        v.add("anirudha");
        v.add("swechha");
        v.add("purnima");
        v.add("abhinaya");
        v.add("pooja");
        v.add("sayali");
        v.add("anirudha");
        v.add("anirudha");
        v.add("anirudha");
        v.add("anirudha");
        v.add("anirudha");

        System.out.println("size="+v.size()); // 21
        System.out.println("capacity="+v.capacity()); // 40

        System.out.println();

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Using Enumeration --> ");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}
