//Overriding 
class Parent{
	Parent(){
		System.out.println("In parent Constrctor1");
	}
	void marry(){
		System.out.println("deepika  ");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("in child cons");
	}
	void marry(){
		System.out.println("Alia");
 	}
}
class Client{
	public static void main(String args []){
	Child  obj = new Child ();
	obj.marry();
}
}

