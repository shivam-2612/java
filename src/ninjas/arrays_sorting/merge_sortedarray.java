package ninjas.arrays_sorting;

import java.util.Scanner;

public class merge_sortedarray {
	public static void main(String[] args) {
		int[] arr1=takeinput();
		int[] arr2=takeinput();
		int[] arr3= merge_two_sortarray(arr1, arr2);
		printarr(arr3);		
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
	public static int[] merge_two_sortarray(int[] arr1, int[]arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int arr[]=new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[k]=arr2[j];
				j++;
				k++;
			}
				
			}
		while(i<n) {
			arr[k]=arr1[i];
			i++;
			k++;
			
		}
		while(j<m) {
			arr[k]=arr2[j];
			j++;
			k++;
			
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
