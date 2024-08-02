import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner gani = new Scanner(System.in);
        int numberofelements = gani.nextInt();
        int[] array = new int[numberofelements];
        for(int i = 0; i < numberofelements; i++){
            array[i] = gani.nextInt();
        }
        int findingElement = gani.nextInt();
        for (int i:array){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("the element is found in "+binary_Search(numberofelements,array,findingElement));
    }
    public static int binary_Search(int numberofelements, int[] array, int findingElement) {
        int start = 0;
        int end = numberofelements;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == findingElement) {
                return mid;
            } else if (array[mid] < findingElement) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
        }
        return -1;
    }
}
