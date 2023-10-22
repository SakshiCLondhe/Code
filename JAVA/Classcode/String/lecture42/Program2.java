//String  
class StringDemo{
	public static void main(String  args[]){
	String str1="Sakshi";  //scp
	String str2="Sakshi"; //Scp
	String str3=new String ("Sakshi");//Heap
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	System.out.println(System.identityHashCode(str3));
	}
}

