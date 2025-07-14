package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        hm.put(12,"amol");
        hm.put(34,"rahul");
        hm.put(11,"rohit");
        hm.put(44,"vaishali");
        hm.put(13,"rashmi");

        System.out.println("hm="+hm);

        LinkedHashMap<Integer,String> hm2 = new LinkedHashMap<>();

        System.out.println("hm2="+hm2);

        hm2.putAll(hm);

        System.out.println("hm2="+hm2);






    }
}
