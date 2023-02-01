package ninjas.maths;
import java.util.*;

public class pair_sum {

	public static void main(String[] args) {
		int[] arr=takeinput();
		pairs(arr);		
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
	public static void pairs(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==target) {
					count++;
					System.out.println(arr[i]+","+arr[j]);
				}
			}
			
		}
		System.out.println(count);
	}
}
