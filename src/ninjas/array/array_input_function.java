package ninjas.array;
import java.util.*;

public class array_input_function {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printarr(arr,n);
	}
	public static void printarr(int arr[],int n) {
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}*/
	public static void main(String[] args) {
		int[] arr=takeinput();
		printarr(arr);	
		System.out.println(Arrays.toString(arr));
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
	public static void printarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		
	}
}
}