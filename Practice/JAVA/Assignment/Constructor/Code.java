// Hidden this refernce 
class Demo{
	int x=10;
	Demo(){

		System.out.println(" in cons"); //   when we make object of a class then its call to constructor 
		System.out.println(this);//  this prints address
		System.out.println(this.x);//this.x print the value of x
	}
	void fun(){
		System.out.println(this);// this prints address
		System.out.println(x);
	}
	public static void main(String [] a){
		Demo obj = new Demo();
		System.out.println(obj);// obj prints address
		obj.fun();
	}
}
