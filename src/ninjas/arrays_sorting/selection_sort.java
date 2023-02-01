package ninjas.arrays_sorting;

import java.util.Scanner;

public class selection_sort {
	public static void main(String[] args) {
		int[] arr=takeinput();
		selectionsort(arr);
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
	public static void selectionsort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int min=Integer.MAX_VALUE;
			int minI=-1;
			for(int j=i;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minI=j;
				}
			}
			int temp=arr[minI];
			arr[minI]=arr[i];
			arr[i]=temp;
		}
		
		
	}
	public static void printarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		
		}

	}
}
