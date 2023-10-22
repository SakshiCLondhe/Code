class Parent{
	int x=10;
	Parent(){
		System.out.println("In constructor 1");
		System.out.println(x);
	}
}
class Child extends Parent{
	int y=20;
	Child (){
		System.out.println("In constructor 2");
		System.out.println(y);
	}
}
class Client{
	public static void  main(String a []){
	System.out.println("In main");
	Child obj = new Child ();
}
}


