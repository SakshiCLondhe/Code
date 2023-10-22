interface Demo {
	void fun (); //public abstract void fun()

	void gun();//public abstract void gun()
}
abstract class DemoChild implements Demo {
	public void fun(){ //write public is compulsory
		System.out.println("in fun");
	}
	public void gun(){ //write public is compulsory
		System.out.println("in gun");
	}
}
class Client{
	public static void main(String args []){
	Demo obj = new DemoChild();
	}
}




