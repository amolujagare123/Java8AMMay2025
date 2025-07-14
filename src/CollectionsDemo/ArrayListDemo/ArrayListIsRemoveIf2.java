package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListIsRemoveIf2 {

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

        // remove elements having length less than or equal to 5
        // -> predicate symbol

        al.removeIf(str -> str.length()<=5);
       // al.removeIf(str -> (str.charAt(0) == 'a'));


        System.out.println("al="+al);


    }
}
