//String Buffer
class Demo1{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer ("Londhe");

		System.out.println(sb);
		System.out.println(sb.capacity()); //Default capacity is 16
	 	sb.append("Sakshi");
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
