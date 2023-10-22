import java.util.*;
class Demo extends Exception{
}

class Parent{
	void m1(){

	System.out.println(" In m1 parent");
	}
}
class Child extends Parent
{
	@Override
	void m1(int x){
		System.out.println(" in m2 child");
	}
}
class Client {
	public static void main(String args []){
		Parent p = new Child ();
		p.m1();
	}
}


