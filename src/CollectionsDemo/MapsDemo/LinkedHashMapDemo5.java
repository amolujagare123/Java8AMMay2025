package CollectionsDemo.MapsDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo5 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        hm.put(12,"amol");
        hm.put(34,"rahul");
        hm.put(11,"rohit");
        hm.put(44,"vaishali");
        hm.put(13,"rashmi");

        System.out.println("hm="+hm);

        Set keys =  hm.keySet();
        Collection values = hm.values();
        Set entrySet = hm.entrySet();

        System.out.println("keys="+keys);
        System.out.println("values="+values);
        System.out.println("entrySet="+entrySet);












    }
}
