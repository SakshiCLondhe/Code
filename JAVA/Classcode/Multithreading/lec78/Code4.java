class Demo extends Thread{
	public void run(){
		System.out.println("in run");
	   Thread t=Thread.currentThread();
	   System.out.println(t.getPriority());
	}
}
class ThreadDemo{
	public static void main(String args []){
        Thread t=Thread.currentThread();
	System.out.println(t.getPriority());
	Demo obj= new Demo();
	obj.start();
	t.setPriority(7);
	Demo obj1=new Demo();
	obj1.start();

	}
}
