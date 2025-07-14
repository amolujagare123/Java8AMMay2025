package CollectionsDemo.MapsDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "hi-this-is-my-name";

        // Convert input to lowercase to make it case-insensitive
        input = input.toLowerCase(); // capgemini

        // LinkedHashMap to maintain insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();


        char[] inputArray = input.toCharArray();


        // Count each character
        for (char ch : inputArray) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }


        System.out.println(charCountMap);

        // Print the result in the specified format
   /*     for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey() + "->" + entry.getValue() + " ");
        }*/
    }
}
