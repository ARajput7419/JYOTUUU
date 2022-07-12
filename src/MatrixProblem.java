import java.util.Scanner;

public class MatrixProblem {
    public static void main(String[] args) {
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




        // Sum of each row using simple for loop

        System.out.println(" Sum using simple for loop ");
        for ( int i = 0;i<row;i++){
            int sum = 0;
            for (int j=0;j<column;j++){
                sum+=matrix[i][j];
            }
            System.out.println(sum);
        }

        // Sum of each row using for - each loop

        System.out.println(" Sum using for each loop ");


        for (int [] row1:matrix){
            int sum = 0;
            for (int value:row1)
                sum+=value;
            System.out.println(sum);
        }


    }
}
