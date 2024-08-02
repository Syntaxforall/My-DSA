import java.util.Scanner;

public class sqare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPowerOfThree(n)?"Yes":"no");
    }
    
    public static boolean isPowerOfThree(int n) {
        for(int i=0;i<31;i++){
           int ans=(int)Math.pow(3,i);
           if(n==ans)return true;
        }
        return false; 
       }
}
