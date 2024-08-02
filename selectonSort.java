import java.util.*;
public class selectonSort {
    public static void main(String[] args) {
        Scanner gani = new Scanner(System.in);
        int no_of_elements = gani.nextInt();
        int[] arr = new int[no_of_elements];
        for (int i = 0; i < no_of_elements; i++) {
            arr[i] = gani.nextInt();
        }
        System.out.println("before sort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort1(no_of_elements,arr);
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

