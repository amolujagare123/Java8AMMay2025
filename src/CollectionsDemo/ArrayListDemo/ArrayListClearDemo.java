package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListClearDemo {

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

        al.clear();

       System.out.println("al="+al);


    }
}
