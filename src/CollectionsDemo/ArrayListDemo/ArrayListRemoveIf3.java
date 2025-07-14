package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveIf3 {

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

  // remove all odd numbers

        al.removeIf(a -> (a%2 !=0));

        System.out.println("al="+al);



    }
}
