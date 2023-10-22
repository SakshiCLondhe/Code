
class Code1{
	int x=10;
	static int y= 20;
	System.out.println(code1.y);
	static {
		System.out.println("In Staticblock 1");
	}
	public static void main(String args []){
		Code1 obj = new Code1();
		System.out.println(Code1.y);
	}
	static {
		System.out.println("in static block 2");
	}
}



