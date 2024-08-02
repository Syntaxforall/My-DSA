import java.util.*;
public class bye {
    public static void main(String[] args) {
        Scanner gani=new Scanner(System.in);
        Random r=new Random();
        selectonSort s=new selectonSort();
        int a=gani.nextInt();
        int range=gani.nextInt();
        int[] z=new int[a];
        for(int i=0;i<a;i++){
            z[i]=r.nextInt(range);
        }
        System.out.println("the random number are taken");
        for(int i:z){
            System.out.print(i+" ");
        }
        System.out.println();
        s.sort1(a,z);
    }
}
