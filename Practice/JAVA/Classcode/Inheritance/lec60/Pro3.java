class Parent{
	int x=40;
	Parent(){
		System.out.println("In constructor");
		System.out.println(x);
	}
	void access(){
		System.out.println("In access");
	}
}
class Child extends Parent{
	int y=80;
	Child(){
		System.out.println("in con");
		System.out.println(x);
		System.out.println(y);
		
	}
}
class client{
	public static void main(String []a){
		System.out.println("Inmain");
		Child obj = new Child ();
		obj.access();

	}
}		
