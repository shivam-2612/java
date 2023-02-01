package ninjas.maths;
import java.util.*;

public class prime_till_n {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2; i<n; i++) {
			int c=0;
			for(int d=2; d*d<=n ;d++) {
				if(i%d==0) {
					c++;
					break;
				}
			}
			if (c==0) {
				System.out.println(i);
			}
		}
		
	}

}
