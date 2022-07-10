import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int data [] = new int[n];
        for (int i=0;i<n;i++) data[i] = scanner.nextInt();
        Arrays.sort(data); // sorted data
        boolean flag=false;
        for (int i =0;i<data.length-1;){
            if (data[i]==data[i+1])
                i+=2;
            else
            {
                flag = true;
                System.out.println(data[i]);
                break;
            }
        }
        if (!flag) System.out.println(data[n-1]);



    }
}
