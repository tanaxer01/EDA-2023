import java.util.Scanner;

class missingNumber {
    static int solve(int n, int[] v) {
        int sum = 0;

        for (int i = 0; i < n-1; i++)
            sum += v[i];

        return n *(n + 1) / 2  - sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int   n = s.nextInt();
        int[] v = new int[n-1];
        for (int i = 0; i < n-1; i++)
            v[i] = s.nextInt();

        int res = missingNumber.solve(n, v);
        System.out.println(res);

        s.close();
    
    }
}
