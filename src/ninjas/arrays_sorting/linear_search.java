package ninjas.arrays_sorting;
import java.util.*;
public class linear_search {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int[][] arr= {
				{24,3,1},
				{56,58,54,26},
				{98,45,25,1,48}
		};
		//String str=sc.next();
		int ans[]=search2d(arr);
		System.out.println(Arrays.toString(ans));		

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
	public static int  searcharr(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(arr.length==0)
			return -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s) 
				return i;
		}
		return -1;


	}
	public static boolean  searcharr2(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(arr.length==0)
			return false;
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]==s) 
				return true;*/
		for(int element:arr) {
			if(element==s)
				return true;
		}
		return false;


	}
	public static boolean  searchchar(String str) {
		Scanner sc=new Scanner(System.in);
		char s='u';
		if(str.length()==0)
			return false;
		/*for(int i=0;i<str.length;i++) {
			if(str.charAt(i)==s) 
				return true;*/
		for(char element:str.toCharArray()) {
			if(element==s)
				return true;
		}
		return false;

	}
	public static int[] search2d(int[][] arr) {
		int target=48;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target)
					return new int[] {i,j};
				
			}
		}
		return new int[] {-1,-1};
		
		
	}
}








