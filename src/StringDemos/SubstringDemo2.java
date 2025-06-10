package StringDemos;

public class SubstringDemo2 {

    public static void main(String[] args) {

        String str = "AMOL";


        for (int i=0 ;i<str.length();i++)
        {
            System.out.println(str);
            str = str.substring(1) + str.charAt(0);

        }



    }
}
