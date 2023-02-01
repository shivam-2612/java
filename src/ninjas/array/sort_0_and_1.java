package ninjas.array;

import java.util.Scanner;

public class sort_0_and_1 {
	public static void main(String[] args) {
		int[] arr=takeinput();
		sort(arr);
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
	public static void sort(int[] arr) {
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<n;i++) {
			arr[i]=1;
		}
	}
	public static void printarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		
		}
	}

}
	
