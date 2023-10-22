class Code14 extends Thread{
	Code14(){

          System.out.println(Thread.currentThread().getThreadGroup());

	}
	Code14(String str){
		System.out.println(Thread.currentThread().getThreadGroup());


	}
	public void run(){
		System.out.println(Thread.currentThread().getName());

	}
}
class Demo{
	public static void main(String args []){
		Code14 obj1=new Code14("xyz");
		Code14 obj2=new Code14("pqr");
		Code14 obj3=new Code14();
		obj1.start();
		obj2.start();
		obj3.start();
	}
}

