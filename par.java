import java.util.*;
public class par {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nextNumber(n));
    }
    public static int nextNumber(int n){
        int next=n+1;
        while(n>=0){
            if(isprime(next)){
                return next;
            }
            next++;
        }
        return next;
    }
    public static boolean isprime(int next){
        if(next==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(next);i++){
            if(next%i==0)return false;
        }
        return true;
    }
}
