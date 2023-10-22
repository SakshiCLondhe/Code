//String 
class StringDemo2{
	public static void main(String args []){
		int x=65;
		char str1[]={'A'};
		String str2="A";
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}
}

