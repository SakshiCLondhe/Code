class Mythread extends Thread{
	public void run(){
		System.out.println("in run");
		System.out.println("Thread Name:"+Thread.currentThread().getName());
	}
	public void start(){
		System.out.println("hey start");
		run();

	}
}
class ThreadDemo{
	public static void main(String args []){
		Mythread obj =new Mythread();
		obj.start();
		System.out.println("ThreadName:"+Thread.currentThread().getName());
	}
}
