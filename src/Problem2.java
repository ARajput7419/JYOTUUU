import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int data [] = new int[n];
        for (int i=0;i<n;i++) data[i] = scanner.nextInt();



        int ans = 0;
        for (int i:data) ans= ans ^ i;

        System.out.println(ans);

    }
}
