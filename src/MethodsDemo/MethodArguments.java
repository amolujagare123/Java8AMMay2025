package MethodsDemo;

public class MethodArguments {

    int a;
    int b;

    void myMethod1() // no arguments
    {
        int c;
        c= a + b;
        System.out.println(c);
    }
    void myMethod2(int x) // 1 arguments
    {
        int c;
        c= x + b;
        System.out.println(c);
    }

    void myMethod3(int x,int y , int z) // 3 arguments
    {
        int c;
        c= x + y + z;
        System.out.println(c);
    }


    void myMethod4(int x,double y, char z)
    {
        double c;
        c= x + y;
        System.out.println(c);
        System.out.println(z);
    }

    void myMethod5(int x,double y, String z)
    {
        double c;
        c= x + y;
        System.out.println(c);
        System.out.println(z);
    }


    void method6(int[] arr)
    {
        for (int x:arr)
        {
            if(x%2 == 0)
                System.out.println(x+" Even");
            else
                System.out.println(x+" Odd");
        }

    }

    void printArray(String[][] stArr) {

        for (int i=0;i< stArr.length;i++)
        {
            for (int j=0;j< stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        MethodArguments ob = new MethodArguments();

        int[] a = {11,23,45,67,11,89,23};

        ob.method6(a);

        ob.myMethod1();
        ob.myMethod2(12);
        ob.myMethod3(11,22,33);
        ob.myMethod4(11,23.45,'g');
        ob.myMethod5(11,23.45,"text");


        String[][] myArray = {
                {"Amit", "Priya", "Rahul"},
                {"Sneha", "Vikram", "Neha"},
                {"Rohan", "Anjali", "Karan"},
                {"Meera", "Arjun", "Pooja"}
        };

        ob.printArray(myArray);

    }
}
