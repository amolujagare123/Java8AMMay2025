package CollectionsDemo.MapsDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(12,"amol");
        hm.put(34,"rahul");
        hm.put(11,"rohit");
        hm.put(44,"vaishali");
        hm.put(12.23,11);
        hm.put('d',true);
        hm.put(true,"amol");
        hm.put(112,"amol2");
        hm.put(567,"amol3");
        hm.put(563,null);
        hm.put(564,null);
        hm.put("abcd",'c');
        hm.put(null,'c');
        hm.put(null,123);


        System.out.println(hm);


        System.out.println(hm.getOrDefault(11,0));

        hm.put(11,'c');

        System.out.println(hm);

    }
}
