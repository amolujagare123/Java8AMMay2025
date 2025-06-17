package ClassNConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str ;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }
 /*   MyClass2()
    {

    }*/

    MyClass2()
    {
        a = 10 ;
        d = 11.23;
        c= 'g';
        str = "suresh";
    }

    // parameterized constructor
    MyClass2(int a1, double d1, char c1, String str1)
    {
        a = a1 ;
        d = d1;
        c= c1;
        str = str1;
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();
        ob.display();


        MyClass2 ob2 = new MyClass2(12,3.14, 'd',"text");

        ob2.display();
    }

}
