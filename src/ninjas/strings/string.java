package ninjas.strings;
import java.util.*;

public class string {
	public static void main(String[] args) {
		
	
	String s="Shivam";
	String str2=" Goyal";
	String str3="Shiva";
	System.out.println(s.equals(str3));
	System.out.println(s.compareTo(str3));
	System.out.println(s.contains(str3));
	s=s.concat(str2);//str1 = str1+str2;
	System.out.println(s);
	System.out.println(s.charAt(5));
	System.out.println(s.length());
	String str4= s.substring(2, 5);
	System.out.println(str4);
	System.out.println(str4.length());
	}

}
