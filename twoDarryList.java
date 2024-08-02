import java.util.*;
public class twoDarryList {
    public static void main(String[] args) {
        Scanner gani=new Scanner(System.in);
        ArrayList<ArrayList<String>> all=new ArrayList<>();
        boolean flag=false;
        System.out.println("Enter name of the lists");
        while(!flag){
            String x=gani.nextLine();
            if(x.equalsIgnoreCase("bye")){
                flag=true;
            }
            else{
                all.add(new ArrayList<>(Arrays.asList(x.split(" "))));
            }
        }
        for(int i=0;i<all.size();i++){
            for(int j=0;j<all.get(i).size();j++){
                System.out.print(all.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
