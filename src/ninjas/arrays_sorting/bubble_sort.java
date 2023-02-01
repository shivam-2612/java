package ninjas.arrays_sorting;

import java.util.Scanner;

public class bubble_sort {
	public static void main(String[] args) {
		int[] arr=takeinput();
		bubblesort(arr);
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
	public static void bubblesort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
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
