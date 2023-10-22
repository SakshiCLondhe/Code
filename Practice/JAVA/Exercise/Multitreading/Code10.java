class Demo extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo{
	public static void main(String args []){
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority());
	Demo obj = new Demo();
	obj.start();
	obj.setPriority(8);


	}

}

