package Arrays.TwoDArrays;

public class StringDemo1 {

    public static void main(String[] args) {

        String[][] stArr = new String[4][3];

        stArr[0][0] = "Amit";
        stArr[0][1] = "Priya";
        stArr[0][2] = "Rahul";

        stArr[1][0] = "Sneha";
        stArr[1][1] = "Vikram";
        stArr[1][2] = "Neha";

        stArr[2][0] = "Rohan";
        stArr[2][1] = "Anjali";
        stArr[2][2] = "Karan";

        stArr[3][0] = "Meera";
        stArr[3][1] = "Arjun";
        stArr[3][2] = "Pooja";


        // Printing the array using two for loops
        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j] + "\t");
            }
            System.out.println(); // move to next line after each row
        }
    }


}
