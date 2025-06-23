package InheritanceDemo.Polymorphism;

public class Addition {
    int a;
    int b;

    void addition()
    {
        int c;
        c = a+b;
        System.out.println("c="+c);
    }

    void addition(int x)
    {
        int c;
        c = x+b;
        System.out.println("c="+c);
    }

    void addition(int x,int y)
    {
        int c;
        c = x+y;
        System.out.println("c="+c);
    }

    void addition(double x,double y)
    {
        double c;
        c = x+y;
        System.out.println("c="+c);
    }

    void addition(String x,String y)
    {
        String c;
        c = x+y;
        System.out.println("c="+c);
    }

    void addition(int x,int y,int z)
    {
        int c;
        c = x+y+z;
        System.out.println("c="+c);
    }

    public static void main(String[] args) {
        Addition ob =new Addition();
        ob.addition();
        ob.addition(12);
        ob.addition(12,12);
        ob.addition(12,12,12);
        ob.addition(12.45,12.11);
        ob.addition("Java","-Selenium");

    }
}
