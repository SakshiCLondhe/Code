class Pro3{
	public static void main(String arg []){
		String str1="Sakshi";
		String str2="Londhe";
		String str3=str1+str2;
		String str4="SakshiLondhe";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}


