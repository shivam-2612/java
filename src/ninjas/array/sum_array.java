package ninjas.array;
import java.util.*;

public class sum_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		int[] arr=takeinput();
		sumarr(arr);		
	}
	}
		
		
	
	public static int[] takeinput() {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	public static void sumarr(int[] arr) {
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			
	}
		System.out.println(sum);
}
}
