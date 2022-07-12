import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int [] array = new int[100]; // 1 D Array

        int array1[][][][] = new int[2][2][4][5];
//        : : : : :
//        : : : : :
//        : : : : :
//        : : : : :
//
//
//        : : : : :
//        : : : : :
//        : : : : :
//        : : : : :
//
//
//        : : : : :
//        : : : : :
//        : : : : :
//        : : : : :
//
//        : : : : :
//        : : : : :
//        : : : : :
//        : : : : :
//
//
//        array1[0][1][0][3]

        System.out.println("Enter number of rows ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        System.out.println("Enter number of columns ");
        int column = scanner.nextInt();

        int [] [] matrix = new int[row][column];

        System.out.println("Enter elements ");
        for (int i =0;i<row;i++){
            for (int j = 0;j<column;j++)
            {
                matrix[i][j]=scanner.nextInt();
            }
        }

        // Display


        for (int []row1:matrix){
            for (int ele:row1){
                System.out.print(ele+" ");
            }
            System.out.println();
        }



        /*
        Example

         row = 3
         column = 4

         Before initialization

         0 0 0 0
         0 0 0 0
         0 0 0 0

         After initialization

         1 2 3 4
         5 6 7 8
         9 1 2 3




         */



    }
}
