import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        /*
        Example
        2d Jagged Array

        1 2 4 5 6
        2 3 4
        1 2
        1 2 3 4 5
        1 4 5 6 7 8 1 2 3 4

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row = scanner.nextInt();
        int [][] array= new int[row][];
        for (int i = 0;i<row;i++){
            System.out.println("Enter number of column for "+i+" th row ");
            int column = scanner.nextInt();
            array[i]= new int[column];
        }


        // 0 0 0 0
        // 0 0
        // 0 0 0 0 0 0 0 0 0

        // Initialization
        for (int i =0;i<array.length;i++)
        {
            for (int j = 0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("\nUsing for each loop ");
        for (int []row1:array){
            for (int ele:row1){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
