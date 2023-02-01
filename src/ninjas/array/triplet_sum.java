package ninjas.array;

import java.util.Scanner;

public class triplet_sum {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		int[] arr=takeinput();
		pairs(arr);		
	}
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
	
	public static void pairs(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) { 
					if(arr[i]+arr[j]+arr[k]==target) {
					count++;
					System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					}
				}
			
			}
		}
		System.out.println(count);
	}

}

