package ninjas.maths;
import java.util.*;

public class print_all_pairs {

	public static void main(String[] args) {
		int[] arr=takeinput();
		printallpairs(arr);		
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
	public static void printallpairs(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n ;j++) {
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
		
		
	}

}
