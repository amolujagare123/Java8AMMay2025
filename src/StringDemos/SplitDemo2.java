package StringDemos;

public class SplitDemo2 {


    public static void main(String[] args) {
        String str = "Hey baby you are so lovely";

        // print only the words that ends with 'y'

        String[] stArr = str.split(" ");

        for( int i=0; i<stArr.length ; i++)
        {
            String tempStr = stArr[i] ; // hey
            int l = tempStr.length();

            if (tempStr.charAt(l-1) == 'y')
               System.out.println(stArr[i]);
        }
    }
}
