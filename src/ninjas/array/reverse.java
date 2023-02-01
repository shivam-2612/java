package ninjas.array;
import java.util.*;
import java.util.Arrays;

public class reverse {
	public static void main(String[] args) {
		int arr[]= {1,5,4,8,9,3,7,5,4};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void reverse(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<e) {
			swap(arr,s,e);
			s++;
			e--;
		}
	}
	static void swap(int arr[],int s,int e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
	}

}
