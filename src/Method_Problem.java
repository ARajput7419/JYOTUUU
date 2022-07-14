import java.util.Scanner;

public class Method_Problem {

    static int sum(int n){
        int res = 0;
        for (int  i =1;i<=n;i++)
            res+=i;
        return res;

    }
    static int sum2(int n ){
        return n*(n+1)/2;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int s = sum(n);
        System.out.println(s);
        System.out.println("Using formula .... ");
        System.out.println(sum2(n));
    }
}
