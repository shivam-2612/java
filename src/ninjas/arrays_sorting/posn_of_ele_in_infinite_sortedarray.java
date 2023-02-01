package ninjas.arrays_sorting;

public class posn_of_ele_in_infinite_sortedarray {
	public static void main(String[] args) {
		int arr[]= {2,3,5,6,7,10,11,12,15,23,23,50,85,96,320};
		int target=50;
		System.out.println(search(arr,target));
	}
	public static int search(int arr[], int target) {
		int start=0;
		int end=1;
		if(arr[end]<target) {
			int newstart=end+1;
			end=end+(end-start+1)*2;
			start=newstart;
		}
		return binarysearch(arr,start,end,target);
			
		}
	public static int binarysearch(int arr[], int start, int end,int target) {
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
