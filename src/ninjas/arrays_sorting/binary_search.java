package ninjas.arrays_sorting;

import java.util.Scanner;

public class binary_search {
	public static void main(String[] args) {
		int[] arr=takeinput();
		int index=binarysearch(arr);
		System.out.println(index);
		
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
	public static int binarysearch(int []arr) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
		int mid=(start+(end-start)/2);
		if(target>arr[mid]) {
			start=mid+1;
		}
		else if(target<arr[mid]){
			end=mid-1;
		}
		else {
			return mid;
		}
		}
		return -1;
		
	}
	

}
