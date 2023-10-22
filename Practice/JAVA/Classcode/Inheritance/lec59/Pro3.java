class Parent{
	Parent(){
	System.out.println(this);
	System.out.println("Hey i m yours parent class");
	}
}
class Child extends Parent{
	Child(){
        System.out.println(this);
	System.out.println("hey i m your child");
	}
}
class Client{

	public static void main(String args [])
	{
	
	Parent Obj = new Child();
	}
}


