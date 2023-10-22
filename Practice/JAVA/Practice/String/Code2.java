import java.util.*;
class Code2{
	public static void main(String args []){
	String str1 ="Sakshi";
	String str2=new String ("Sakshi");
	char  str3[]= {'S','A','K','S','H','I'};
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	}
}

