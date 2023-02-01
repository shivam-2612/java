package ninjas.array;

import java.util.Scanner;

public class rotate_array {
	public static void main(String[] args) {
		int[] arr=takeinput();
		rotate(arr);
		printarr(arr);		
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
	public static void rotate(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int n=arr.length;
		int dup[]=new int[d];
		int j=0;
		int k=0;
		if(d>0 && d<n) {
		for(int i=0;i<d;i++) {
			dup[j]=arr[i];
			j++;
		}
		for(int i=d;i<n;i++) {
			arr[k]=arr[k+d];
			k++;
		}
		for(int i=n-d;i<n;i++) {
			arr[i]=dup[j];
			j++;
		}
		
		
		
		}
	}
			
		
		
	
	public static void printarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		
		}

	}

}
