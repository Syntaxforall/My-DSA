import java.util.*;
class hi{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random r=new Random();
        System.out.println("no fo elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter range:");
        int range =sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=r.nextInt(range);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        sort1(n,arr);
    }
    public static void sort1(int no_of_elements, int[] arr){
        int temp = 0;
        int min = 0;
        for (int i = 0; i < no_of_elements; i++) {
            min = i;
            for (int j = i + 1; j < no_of_elements; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("after sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}