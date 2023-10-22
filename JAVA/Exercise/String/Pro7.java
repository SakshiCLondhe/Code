class Pro7{
	public static void main(String args[]){
       String  str1="Sakshi";
       String str2="Londhe";
       System.out.println(str1+str2);
       String str3="SakshiLondhe";
       String str4=str1+str2;
       System.out.println(System.identityHashCode(str3));
       System.out.println(System.identityHashCode(str4));
	}
}	


