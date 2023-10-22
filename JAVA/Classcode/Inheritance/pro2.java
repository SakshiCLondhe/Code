class Parent{
	int x=20;
	static int y=30;
	Parent(){
		System.out.println("parent");
	}
}
class Child extends Parent{
	Child (){
		System.out.println("Child");

	}
	void access(){
//	System.out.println(super.x);
	System.out.println(this.x);
	}
}
class Client{
	public static void main(String args []){
		Child obj = new Child ();
		obj.access();

	}
}
