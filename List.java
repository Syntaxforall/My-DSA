import java.util.*;
class List
{
  public static void main(String args[])
  {
	Scanner g=new Scanner(System.in);
	  int n=g.nextInt();
	  LinkedList<Integer> link=new LinkedList<Integer>();
	  for(int i=0;i<n;i++){
		  int temp=g.nextInt();
		  link.add(temp);
	  }
	  int i=0;
	  int l=n-1;
	  for(int j=1;j<=n;j++){
		  if(j%2!=0){
			  System.out.print(link.get(l)+" ");
			  l--;
		  }
		  else{
			  System.out.print(link.get(i)+" ");
			  i++;
		  }
	  }
  }
}