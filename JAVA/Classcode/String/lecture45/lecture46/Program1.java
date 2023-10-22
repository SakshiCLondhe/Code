//String Buffer
class  SBDemo{
	public static void main(String args []){
	StringBuffer sb= new StringBuffer("Sakshi");
	sb.append("Chandrakant");
	sb.append("Londhe");
	System.out.println(sb);
	System.out.println(sb.capacity());
	sb.append(" div=ii");
	System.out.println(sb);
	System.out.println(sb.capacity());
	}
}

