package ninjas.array;
import java.util.*;

public class array_intersection {

	public static void main(String[] args) {
		int[] arr1=takeinput();
		int[] arr2=takeinput2();
		intersection(arr1,arr2);		
		
		
	}
	public static int[] takeinput() {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		return arr1;
		
	}
	public static int[] takeinput2() {
		Scanner sc=new Scanner(System.in);
	int m= sc.nextInt();
	int arr2[]=new int[m];
	for(int i=0;i<m;i++) {
		arr2[i]=sc.nextInt();
	}
	return arr2;
	}
	public static void intersection(int[] arr1, int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
		
		
	}
}