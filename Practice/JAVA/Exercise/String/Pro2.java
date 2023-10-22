class Pro2{
	public static void main(String args []){
		String str1= "Sakshi";
		String str2=new String ("Sakshi");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		String str3 = "Sakshi";
		String str4=new String ("Sakshi");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}

