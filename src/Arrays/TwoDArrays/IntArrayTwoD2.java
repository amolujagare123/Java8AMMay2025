package Arrays.TwoDArrays;

public class IntArrayTwoD2 {

    public static void main(String[] args) {

        int[][] a1 = {
                {11,12,13},
                {33,44,55},
                {32,43,54},
                {10,30,50}
        };

        int[][] a2 = {
                {21,112,143},
                {334,411,556},
                {322,43,524},
                {110,310,560}
        };

        int[][] a3 = new int[4][3];

        int row = a1.length;
        int col = a1[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<a1.length;i++) // 4
        {
            for(int j=0;j<a1[0].length;j++) // 2
            {
                a3[i][j] = a1[i][j] + a2[i][j];
            }

           // System.out.println();
        }


        for(int i=0;i<a3.length;i++) // 4
        {
            for(int j=0;j<a3[0].length;j++) // 2
            {
                System.out.print(a3[i][j]+"\t");
            }

            System.out.println();
        }


    }
}
