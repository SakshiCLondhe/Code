//String Buffer=mutable,Sysnchronized
class StringBufferDemo{
	public static void main(String args []){
	StringBuffer str1 =new StringBuffer("sakshi");
	System.out.println(System.identityHashCode(str1));
	str1.append("Londhe");
	System.out.println(System.identityHashCode(str1));
	}
}


