import java.util.*;
public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="abrba";
        int n=str.length();
        int i=0;
        if(isP(str,n-1,i)){
            System.out.println("the paldrome");
        }
        else{
            System.out.println("not a paldrome");
        }
    }
    public static boolean isP(String value, int n,int i){
        while(i<n){
            if(value.charAt(i)!=value.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}

