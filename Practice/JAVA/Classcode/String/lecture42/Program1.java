//String 
class StringDemo{
	public static void main (String args[]){
		String str1="Sakshi";
		String str2="Londhe";
		String str3="SakshiLondhe";
		String str4=str1+str2;
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}}
