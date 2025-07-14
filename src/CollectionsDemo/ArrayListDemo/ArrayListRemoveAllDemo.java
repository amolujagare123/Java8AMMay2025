package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveAllDemo {

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
        al2.add("Mumbai");
        al2.add("Delhi");
        al2.add("Bangalore");
        al2.add("Chennai");
        al2.add("Hyderabad");
        al2.add("purnima");
        al2.add("abhinaya");
        al2.add("pooja");
        al2.add("sayali");


        System.out.println("al2="+al2);

        al2.removeAll(al);

       System.out.println("al2="+al2);


    }
}
