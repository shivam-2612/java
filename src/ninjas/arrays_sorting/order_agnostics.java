package ninjas.arrays_sorting;
import java.util.*;

public class order_agnostics {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {90,45,36,23,11,2,0};
		int target=sc.nextInt();		
		int index=binarysearch(arr,target);
		System.out.println(index);
	}
	public static int binarysearch(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		boolean isasc=arr[start]<arr[end];
		while(start<=end) {
			int mid=(start+(end-start)/2);
			if(arr[mid]==target)
				return mid;
			if(isasc==true) {
				if(target>arr[mid]) {
					start=mid+1;
				}
				else if(target<arr[mid]){
					end=mid-1;
				}

			}
			else {
				if(target>arr[mid]) {
					end=mid-1;
				}
				else if(target<arr[mid]){
					start=mid+1;
				}
			}
				
			}
		return -1;

		}

	}
