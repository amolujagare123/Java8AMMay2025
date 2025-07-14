package CollectionsDemo.StackDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Mumbai");
        s.push("Delhi");
        s.push("Bengaluru");
        s.push("Hyderabad");
        s.push("Ahmedabad");
        s.push("Chennai");
        s.push("Pune");
        s.push("Kolkata");

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s);
    }
}
