import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x=true;
        ArrayList<String> friendsList = new ArrayList<>();
        System.out.println("Enter the names of your friends: ");
        System.out.println("Enter change to change name: ");
        System.out.println("Enter Stop to stop the list: ");
        while(x) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                x = false;
            }
            else if(input.equalsIgnoreCase("change")){
                System.out.println("enter your friend's number: ");
                int index=sc.nextInt();
                String newName=sc.nextLine();
                index=index-1;
                friendsList.set(index,newName);
            }
            else {
                friendsList.add(input);
            }
        }
        for(int i=0;i<friendsList.size();i++){
            System.out.println("the number "+(i+1)+":"+friendsList.get(i));
        }
    }
}
