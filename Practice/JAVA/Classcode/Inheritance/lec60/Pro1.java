//Instance method 
class Parent{
	Parent(){
          System.out.println("In parent COnstructor");
	}
	void Parent (){
		System.out.println("In instance methid ");
	}
}
class Child extends Parent  {
	Child(){
		System.out.println("Child Constructor ");
	}
}
class Client{
	public static void main(String args []){
	Child obj = new Child();
	obj.Parent();
}
}



