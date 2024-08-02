// import java.util.*;
// class  friends{
// int rollno;
// String name;	
// }
// public class abrar {

// 	public static void main(String[] vai) {
// 		Scanner sc=new Scanner(System.in);
// 		friends f=new friends();
// 		friends f1=new friends();
// 		ArrayList <friends> frilist=new ArrayList<>();
// 		f.name="Gani";
// 		f1.name="swaroop";
// 		f1.rollno=3131;
// 		f.rollno=3004;
// 		frilist.add(f);
// 		frilist.add(f1);
// 		for(int i=0;i<frilist.size();i++){
// 			System.out.print(frilist.get(i).name+" ");
// 			System.out.print(frilist.get(i).rollno+" ");
// 			System.out.println("");
// 		}
// 	}
// }

import java.util.*;
/**
 * abrar
 */
public class abrar {
public static int fact(int x){
	if(x<=0){
		return 0;
	}
	else if(x==1) {
		return x;
	}
	else{
		return x*fact(x-1);
	}
}
public static double vol(double wei,double height,double depath){
return wei*depath*height;
}
	public static void main(String[] args) {
		Random r=new Random();
		double wei=r.nextDouble(10);
		double height=r.nextDouble(10);
		double depath=r.nextDouble(10);
		// System.out.println(x);
		// System.out.println(fact(x));
		System.out.println(vol(wei, height, depath));
	}
}