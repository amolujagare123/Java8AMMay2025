package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddAllDemo {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("vishal");
        al.add("swechha");
        al.add("purnima");
        al.add("abhinaya");
        al.add("pooja");
        al.add("sayali");
        al.add("anirudha");
        al.add("anirudha");


        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);


    }
}
