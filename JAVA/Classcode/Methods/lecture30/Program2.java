//  object of non static  method
class Demo1{
	public static void main(String args []){
         Demo1 obj =new Demo1();
	 fun();
	 obj.gun();
	}
	static void fun(){
		System.out.println("in fun");
	}
	void gun(){
		System.out.println("in gun");
	}
}

