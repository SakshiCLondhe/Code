class Code5{
	Code5(){
	System.out.println("in con");
	}
	void fun(){
	System.out.println(" in fun");
	Code5 obj1 = new Code5();
 
	}
	public static void main(String args []){
	Code5 obj = new Code5();
	obj.fun();

	}}
