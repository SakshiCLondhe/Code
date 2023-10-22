//string and StringBuffer
class SBDemo1{
	public static void main(String srgs []){
		String str1="Sakshi";
		StringBuffer str3=new StringBuffer("Londhe");	
		StringBuffer str4=str3.append(str1);
		String str2 = str3.concat(str1);
		System.out.println(str2);
		System.out.println(str4);
	}
}

