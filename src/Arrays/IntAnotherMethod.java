package Arrays;

public class IntAnotherMethod {
    public static void main(String[] args) {

        int[] a = {12,45,67,11,22,44,56};

        System.out.println("array length="+a.length);

        System.out.println("using for loop");
        for(int i=0 ;i <a.length ; i++)
           System.out.println(a[i]);

        System.out.println("using for each loop");
        // for each loop
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
