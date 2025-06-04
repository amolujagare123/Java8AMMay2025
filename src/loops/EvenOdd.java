package loops;

public class EvenOdd {

    public static void main(String[] args) {

        // print 1 to 10 numbers
        // also print whether
        // number is even or odd

        for (int i=1 ; i<=10 ;i++) {

            if(i%2 == 0)
               System.out.println(i + " Even");
            else
                System.out.println(i + " odd");
        }

    }
}
