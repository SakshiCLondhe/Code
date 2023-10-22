class StaticDemo3{
	static int x=20;
	static int y=10;
	static void fun(){
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	public static  void main(String args []){
                  System.out.println(StaticDemo3.x);
		System.out.println(StaticDemo3.y);
		StaticDemo3.fun();
	}
}



