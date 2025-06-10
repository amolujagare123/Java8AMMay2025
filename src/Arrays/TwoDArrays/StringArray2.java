package Arrays.TwoDArrays;

public class StringArray2 {
    public static void main(String[] args) {
        // Initializing the array using curly brackets
        String[][] stArr = {
                {"Amit", "Priya", "Rahul"},
                {"Sneha", "Vikram", "Neha"},
                {"Rohan", "Anjali", "Karan"},
                {"Meera", "Arjun", "Pooja"}
        };

        // Printing the array using two for loops
        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {
                System.out.print(stArr[i][j] + "\t");
            }
            System.out.println(); // new line after each row
        }
    }
}
