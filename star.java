import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=(n/2)+1;
    //     for(int i=1;i<=n;i++) {
    //         for (int j = 1; j <= n; j++) {
    //             if (n % 2 == 0) {
    //                 if (j > 1 && j < n && i > 1 && i < n) {
    //                     System.out.print(" ");
    //                 } else {
    //                     System.out.print("*");
    //                 }
    //             }
    //             else {
    //                 if(i==m && j==m) {
    //                     System.out.print("*");
    //                 } else if (j > 1 && j < n && i > 1 && i < n) {
    //                     System.out.print(" ");
    //                 }
    //                 else{
    //                     System.out.print("*");
    //             }
    //         }

    //     }
    //         System.out.println();
    // }
       for (int i = 0; i < n; i++) {
           for(int j=n;j>i;j--){
               System.out.print(" ");
           }
           for (int j = 0;j < i; j++) {
               System.out.print("* ");
           }
           System.out.println(" ");
       }
       for (int i = 0; i < n; i++) {
           for(int j=0;j<i;j++){
               System.out.print(" ");
           }
           for (int j = i;j < n; j++) {
               System.out.print("* ");
           }
           System.out.println(" ");
       }

//import java.util.Scanner;
//public class star {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
    }
}
