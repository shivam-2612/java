package ninjas.array;

import java.util.Scanner;
import java.util.Arrays;

public class q4 {
	public static void main(String[] args) {
		int[] arr1=takeinput();
		int[] arr2=takeinput();
		int[] arr3= findMedianSortedArrays(arr1, arr2);
		double ans=(median(arr3));
		System.out.format("%.5f",ans);
	}
	public static double median(int arr3[]) {
		int len=arr3.length;
		 int d=arr3.length/2;
		 double med=0;
		 double meed=0;
		 if(len%2==0) {
			med= (double)arr3[d-1]+arr3[d];
			meed=med/2;
			 
			 
			
		}
		 else {
			 meed=arr3[(d)];
		 }
		 return meed;
		
	}
		
		
	
	
	public static int[] findMedianSortedArrays(int[] arr1, int[]arr2) {
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
	
}

	