class Demo{
	int x= 10;
	Demo(int x){
		System.out.println(" in demo constructor");
	}
	void fun(){
		System.out.println(x);
	}
	public static void main(String ag[]){
		Demo obj = new Demo(10);
		obj.fun();
	}
}
