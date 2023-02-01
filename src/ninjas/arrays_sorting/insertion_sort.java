package ninjas.arrays_sorting;

import java.util.Scanner;

public class insertion_sort {
	public static void main(String[] args) {
		int[] arr=takeinput();
		insertionsort(arr);
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
	public static void insertionsort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
				}
			arr[j+1]=temp;
			}
		}
			
		
		
	
	public static void printarr(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		
		}

	}

}
