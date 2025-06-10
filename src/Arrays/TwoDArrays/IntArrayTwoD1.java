package Arrays.TwoDArrays;

public class IntArrayTwoD1 {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] =22;
        a[0][1] =12;
        a[0][2] =32;

        a[1][0] =23;
        a[1][1] =14;
        a[1][2] =35;

        a[2][0] =42;
        a[2][1] =52;
        a[2][2] =62;

        a[3][0] =43;
        a[3][1] =54;
        a[3][2] =65;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for(int i=0;i<a.length;i++) // 4
        {
            for(int j=0;j<a[0].length;j++) // 2
            {
                System.out.print(a[i][j]+"\t");
            }

            System.out.println();
        }


    }
}
