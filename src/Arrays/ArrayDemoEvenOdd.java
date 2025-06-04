package Arrays;

public class ArrayDemoEvenOdd {
    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] = 34;
        a[1] = 14;
        a[2] = 44;
        a[3] = 37;
        a[4] = 31;


        System.out.println("using for each loop");
        // for each loop
        for(int x:a)
        {
            if (x%2 == 0)
                 System.out.println(x + " even");
            else
                System.out.println(x + " odd");
        }
    }
}
