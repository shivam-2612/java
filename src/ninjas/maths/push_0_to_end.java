package ninjas.maths;

import java.util.Scanner;

public class push_0_to_end {
	
		public static void main(String[] args) {
			int[] arr=takeinput();
			push(arr);
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
		public static void push(int[] arr) {
			int n=arr.length;
			int j=0;
			
			for(int i=0;i<n;i++) {
				if(arr[i]!=0) {
					arr[j]=arr[i];
					j++;
					
				}
			}
			for(; j<n;j++) {
				arr[j]=0;
			}
				
		}
		public static void printarr(int[] arr) {
			int n=arr.length;
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
				
				}
			
			
		}
}
