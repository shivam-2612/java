package ninjas.array;
import java.util.*;
public class swap_alternate {
	public static void main(String[] args) {
		int[] arr=takeinput();
		swap(arr);		
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
	public static void swap(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
			
				int t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
	}
	}
	
}