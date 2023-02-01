package ninjas.array;
import java.util.*;

public class largest_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int lar=largearr(arr,n);
		System.out.println(lar);
		
	}
	public static int largearr(int arr[],int n) {
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;

	}

}
