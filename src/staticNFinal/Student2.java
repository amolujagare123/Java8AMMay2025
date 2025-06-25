package staticNFinal;

public class Student2 {

    int rno;
    String name;
    public static String college ="ITC";

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("staticMethod1");
      //  System.out.println("rno="+rno); // non-static - not allowed
     //   System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college);// static -allowed
        staticMethod2(); // static -allowed
     //   nonStaticMethod(); // non-static - not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("staticMethod2");
    }

    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name); // non-static -  allowed
        System.out.println("college="+college);// static -allowed
        staticMethod2(); // static -allowed
        nonStaticMethod(); // non-static - allowed
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.staticMethod1();
        s1.staticMethod2(); // using object

        Student2.staticMethod1();
        Student2.staticMethod2(); // using class name

    }

}
