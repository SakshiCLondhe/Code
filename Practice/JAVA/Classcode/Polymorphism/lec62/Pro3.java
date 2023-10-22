//Refernce of parent class nd object of child class 
class Parent{
	void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent {
	void fun(){
		System.out.println("in child fun ");
	}
}
class Client{
	public static void main(String a[]){
		Parent obj = new Parent();
		obj.fun();
	}
}



