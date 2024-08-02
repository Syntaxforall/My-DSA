/**
 * Innerqueue
 */
class Innerqueue {
    private int f,r,size;
    private int[] qu;
    Innerqueue(int s){
        f=r=0;
        size=s;
        qu=new int[s];
    }
    void Enq(int data){
        if(size==r){ 
            System.out.println("the queue is empty");
        return;
    }
        else{
            for(int i=0;i<r-1;i++){
                qu[i]=qu[i+1];
            }
            r--;
        }
    }
    void tr(){
        System.out.print("front<---");
        for (int i : qu) {
            System.out.println(i+"<---");
        }
        System.out.print("rear");
    }
}
public class queue {
   public static void main(String [] args){

   } 
}
