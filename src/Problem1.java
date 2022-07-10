import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int data [] = new int[n];
        // Assuming 0 <= data[i] <= 10,000
        int count[] = new int[10001];
        for (int i=0;i<n;i++) data[i] = scanner.nextInt();


        for (int i:data) count[i]++;

        for(int i:data) {
            if (count[i]==1)
            {
                System.out.println(i+" is occuring once ");
                break;
            }
        }




    }
}
