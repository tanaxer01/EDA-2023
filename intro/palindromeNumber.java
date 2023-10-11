public class palindromeNumber {
   static boolean solve(int n) {
    if (n == 0) return true;
    if (n <  0 || n % 10 == 0) return false;

    int rev = 0;
    int temp = n;
    while (n > 0) {
        rev = (rev*10) + (n%10);
        n /= 10;
    }

    return temp == rev;
   } 
    
   public static void main(String[] args) {
    int a = 121;
    boolean pal = palindromeNumber.solve(a);

    System.out.println(pal);
   }
}
