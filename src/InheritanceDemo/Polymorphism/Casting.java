package InheritanceDemo.Polymorphism;

public class Casting {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        double c =(double) a/b;
// if you want to store one type of value
// into another type then use that type in
// round brackets in front of value to be stored
        // this is called as type casting
        System.out.println("c="+c);
    }
}
