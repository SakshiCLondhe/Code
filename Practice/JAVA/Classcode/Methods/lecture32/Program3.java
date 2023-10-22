//passing value to function 
class Demo2{
	public static void  main(String args []){
		Demo2 obj =new Demo2();
		obj.fun(10);
		obj.fun(10.f);
	
	}
	void fun(int x){
		System.out.println(x);
	}
}


