class Code1{
	int x=10;
	static int y=20;
	Code1(){
		System.out.println(" in  no argument constructor");
	}
	Code1(int a){
		System.out.println(" in constructor");
		}
   static void fun(){
		System.out.println("in fun method");
	}


	public static void main(String args []){
		Code1 obj = new Code1();
		Code1 obj1= new Code1(10);
		obj.fun();
	}
}


