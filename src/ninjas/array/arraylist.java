package ninjas.array;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>>list = new ArrayList<>(10);
		/*list.add(250);
		list.add(53);
		list.add(26);
		list.add(78);
		list.add(6);
		list.add(15);
		System.out.println(list);
		list.set(0, 55);
		list.remove(4);
		System.out.println(list);
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i));}

		System.out.println(list);*/

		for(int i=0; i<3;i++) {

			list.add(new ArrayList<>());
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list.get(i).add(sc.nextInt());
			}
		}
		System.out.println(list);

	}


}
