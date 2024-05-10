import java.util.*;

class Solution {
    static boolean isPrime(int n){
        if(n < 2)
            return false;
        return isPrimeUtil(n, 2);
    }

    static boolean isPrimeUtil(int n, int i) {
        // Base case
        if (i * i > n)
            return true;
        // If n is divisible by any number less than or equal to its square root, it's not prime
        if (n % i == 0)
            return false;
        // Recursively check for divisibility
        return isPrimeUtil(n, i + 1);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Ob = new Solution();
        if (Ob.isPrime(n))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
