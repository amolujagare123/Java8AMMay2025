package MethodsDemo;

public class MethodReturning {

    int myMethod()
    {
        int a =5;

        return a;
    }

    double areaCircle(double r)
    {
        double pi = 3.14;
        double area = pi * r * r;

        return area;
    }

    String stringReverse(String originalString)
    {
        String reverseString = "";

        for (int i = originalString.length()-1 ; i>=0; i--)
        {
            reverseString = reverseString + originalString.charAt(i);
        }

        return reverseString;
    }


    int[] getMyArray(int[] arr)
    {
        int[] doubledArr = new int[arr.length];

        for (int i=0;i<arr.length;i++)
        {
            doubledArr[i] = arr[i] * 2;
        }

        return doubledArr;
    }

    String[][] reverse2DArray(String[][] stArr)
    {
        String[][] result = new String[stArr.length][stArr[0].length];

        for (int i=0;i<stArr.length;i++)
        {
            for (int j = 0 ;j<stArr[0].length;j++)
            {
                result[i][j] = stringReverse(stArr[i][j]);
            }
        }
        return  result;
    }


    public static void main(String[] args) {

        int x = 15;

        System.out.println(x);
        int y = x;
        System.out.println(y);

        MethodReturning ob = new MethodReturning();

        System.out.println("ob.myMethod()="+ob.myMethod());


        int z = ob.myMethod();

        System.out.println("z="+z);

        double radius = 12.5;

        double areaOfCircle = ob.areaCircle(radius);
        System.out.println("areaOfCircle="+areaOfCircle);

        String str = "Purnima";

        System.out.println(ob.stringReverse(str));

        int[] a = {12,45,67,89,11,24,67};

        int[] result = ob.getMyArray(a);


        System.out.println("===== below is the doubled array ====");

        for (int value : result)
            System.out.println(value);

        String[][] stArr = {
                {"Amit", "Priya", "Rahul"},
                {"Sneha", "Vikram", "Neha"},
                {"Rohan", "Anjali", "Karan"},
                {"Meera", "Arjun", "Pooja"}
        };

        String[][] reversedArray = ob.reverse2DArray(stArr);

        System.out.println("===== below is the reversed 2D array ====");

        for (int i=0;i<reversedArray.length;i++)
        {
            for (int j=0;j<reversedArray[0].length;j++)
            {
                System.out.print(reversedArray[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
