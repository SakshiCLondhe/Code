class  Mythread implements Runnable{
	public void run(){
		System.out.println("in run");
		System.out.println("Thread Name:"+Thread.currentThread().getName());
	}
}
class ThreadDemo {
	public static void main(String arg []){
		Mythread obj = new Mythread();
		Thread t= new Thread(obj);
		t.start();
		System.out.println("Thread Name:"+Thread.currentThread().getName());
	}
}

