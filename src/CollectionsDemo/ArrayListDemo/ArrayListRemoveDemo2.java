package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(42);
        al.add(13);
        al.add(52);
        al.add(11);
        al.add(62);
        al.add(17);



        System.out.println("al="+al);

        Integer i = 62;
        //al.remove(i);
        al.remove(3);

        System.out.println("al="+al);



    }
}
