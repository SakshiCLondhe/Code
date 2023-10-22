//Inheritance 
class Parent{
	Parent(){
		System.out.println("Hey");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("HII");
	}
}
class Client{
	public static void main(String args []){
		Parent obj=new Parent();
		Child obj1=new Child();
	}
}

