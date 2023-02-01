package ninjas.array;
import java.util.*;

public class find_unique {
	public static void main(String[] args) {
		int[] arr=takeinput();
		unique(arr);		
		
		
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
	public static void unique(int[] arr) {
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count=0;
			int s=arr[i];
			for(int j=0;j<n;j++) {
				if(arr[j]==s) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
		
		}
		
}


