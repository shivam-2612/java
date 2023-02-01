package ninjas.matrix;

import java.util.Scanner;

public class rotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	}
		transpose(arr,n);
	}
	static void transpose(int arr[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				swap(arr[][],arr[i][j],arr[j][i]);
			}
		}
		for(int i=0;i<n;i++) {
			int low=0;
			int high=n-1;
			while(low<high) {
				swap(arr[][],arr[low][i],arr[high][i]);
				low++;
				high--;
			}
			
		}
	}
		static void swap(arr[][],int s,int e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
	}

}
