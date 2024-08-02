import java.util.*;
public class linearSearch {
   public static void main(String[] args) {
       Scanner gani = new Scanner(System.in);
       int numberofelements = gani.nextInt();
       int[] array = new int[numberofelements];
       for(int i = 0; i < numberofelements; i++){
           array[i] = gani.nextInt();
       }
       int findingElement = gani.nextInt();
       for (int i:array){
           System.out.println(i);
       }
       System.out.println("the element is found in "+linear_Search(numberofelements,array,findingElement));
   }
   public static int linear_Search(int numberofelements, int[] array, int findingElement){
       for(int i = 0 ; i < numberofelements; i++){
           if(array[i] == findingElement){
               return i;
           }
       }
       return -1;
   }
}
