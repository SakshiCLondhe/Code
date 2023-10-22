class Parent{
	static  int x=10;
	Parent(){
		System.out.println("in con 1");
		System.out.println(x);
	}
}
class Child extends Parent{
	Child (){
		System.out.println("---------------");
		System.out.println(x);
 }
}
class Client{
	public static void main(String []a){
		Child obj = new Child();
	}
}


