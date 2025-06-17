package ClassNConstructors;

public class MyClass3 {

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

    MyClass3()
    {
        a = 10 ;
        d = 11.23;
        c= 'g';
        str = "suresh";
    }

    // parameterized constructor with this operator
    MyClass3(int a, double d, char c, String str)
    {
        this.a = a ;
        this.d = d;
        this.c= c;
        this.str = str;
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3();
        ob.display();


        MyClass3 ob1 = new MyClass3(12,3.14, 'd',"text");

        ob1.display();

        MyClass3 ob2 = new MyClass3(16,3.14, 'd',"text");

        ob2.display();
    }

}
