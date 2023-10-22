class StringDemo1{
	public static void main(String args []){
	String str1="Core2Web";
	String str2="Core2Web";
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	String str3=new String("C2W");
	String str4=new String ("C2W");
	System.out.println(System.identityHashCode(str3));
	System.out.println(System.identityHashCode(str4));
	}
}
