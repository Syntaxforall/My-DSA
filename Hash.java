import java.util.*;

public class Hash {
    public static void main(String[] args) {
        HashMap<Character,Integer> ganesh=new HashMap<Character, Integer>();
        ganesh.put('I',1);
        ganesh.put('V',5);
        ganesh.put('X',10);
        ganesh.put('L', 50);
        ganesh.put('C', 100);
        ganesh.put('D', 500);
        ganesh.put('M', 1000);
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        for(int i=0;i<n;i++){
            char a=str.charAt(i);
            System.out.println(ganesh.get(a));
        }
    }
}
