//passing value to function
class Demo3{
	public static void main(String args []){
	Demo3 obj = new Demo3();
	obj.fun(10);
	obj.fun(10.5f);
	obj.fun('A');
	}
	void fun(float x){
		System.out.println(x);
	}
}
