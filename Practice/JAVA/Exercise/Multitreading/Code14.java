class  Mythread extends Thread{
	Mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}


	}
class ThreadGp{

	public static void main(String args []){
		ThreadGroup  PThread =new ThreadGroup("heyy");
                  MyThread obj1= new MyThread(PThread,"Core2Web");
		obj1.start();
	}
}


