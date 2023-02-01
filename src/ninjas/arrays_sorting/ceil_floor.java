package ninjas.arrays_sorting;

import java.util.Scanner;

public class ceil_floor {
	public static void main(String[] args) {
		int[] arr=takeinput();
		
		int in=ceil(arr);
		
		System.out.println(in);
		
		
		
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
	public static int floor(int []arr) {//greatest number<=target
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
		return end;
		
	}
	public static int ceil(int []arr) {//smallest number>=target
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int start=0;
		int end=arr.length-1;
		if(target>arr[end]) {
			return arr[start];
		}
		while(start<=end) {
		int mid=(start+(end-start)/2);
		if(target>arr[mid]) {
			start=mid+1;
		}
		else {
			end=mid-1;
		}
		
		}
		return start;
		
	}

}
