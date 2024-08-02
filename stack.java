import java.util.*;

class Hello {
    // Calculate factorial of a number
    long fun(long a) {
        if (a <= 0 || a == 1) {
            return 1;
        } else {
            return a * fun(a - 1);
        }
    }
    
    // Find the last non-zero digit of a number
    long lastNonZeroDigit(long n) {
        while (n % 10 == 0 && n != 0) {
            n /= 10;
        }
        return n % 10;
    }
}

class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hello h = new Hello();
        int n = sc.nextInt();  
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            long fact = h.fun(a[i]);

            long lastDigit = h.lastNonZeroDigit(fact);
            System.out.println(a[i]);
            System.out.println(fact);
            System.out.println(lastDigit);
        }

        sc.close();  // Close the scanner to avoid resource leaks
    }
}
