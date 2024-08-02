import java.util.*;
class soting
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  for(int i=0;i<n;i++){
		  arr[i]=sc.nextInt();
	  }
	  yort(arr,n/2);
	  xort(arr,n/2);
  }
	public static void yort(int[] arr,int n){
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void xort(int[] arr,int n){
		int x=arr.length;
		int y=x;
		int temp=0;
		for(int i=0;i<y;i++){
			for(int j=0;j<y-1-i;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}