class StaticDemo3{
	int x=20;
	static int y=30;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
	static void funn(){
		System.out.println(y);
	}
}
class User{
	public static void main(String args []){
		StaticDemo3 sd3 = new StaticDemo3();
		sd3.fun();
		StaticDemo3.funn();
	}
}

