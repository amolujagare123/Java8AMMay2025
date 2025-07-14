package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo4 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        hm.put(12,"amol");
        hm.put(34,"rahul");
        hm.put(11,"rohit");
        hm.put(44,"vaishali");
        hm.put(13,"rashmi");

        System.out.println("hm="+hm);
        System.out.println("size="+hm.size());

        System.out.println(hm.containsKey(44));
        System.out.println(hm.containsValue("rashmi"));

        hm.clear();
        System.out.println("hm="+hm);











    }
}
