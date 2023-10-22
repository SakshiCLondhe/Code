import java.util.*;
class Code1{
	public static void main(String args []){
		String str1="Sakshi";
		String str2="Londhe";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		String str3= new String("Sakshi");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

	}
}

