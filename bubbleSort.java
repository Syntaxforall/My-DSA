import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner gani = new Scanner(System.in);
        int numberofelements = gani.nextInt();
        int temp=0;
        int[] array = new int[numberofelements];
        for (int i = 0; i < numberofelements; i++) {
            array[i] = gani.nextInt();
        }
        System.out.println("Bubble before Sort");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i = 0; i < numberofelements; i++){
            for(int j = 0; j < numberofelements-i-1; j++){
                if(array[j] > array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble after Sort");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}