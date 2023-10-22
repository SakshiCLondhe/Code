//overriding 
class Parent{
	Parent(){
		System.out.println("in parent con");
	}
	void fun (){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	Child (){
		System.out.println("In child cons");
	}
	void gun(){
		System.out.println("in child fun");
	}

}
class Client{
	public static void main(String args []){
		Child obj = new Child ();
		obj.fun();
		obj.gun();
		Parent obj1 = new Parent();
		obj1.fun();
		obj1.gun();
	}
	}

