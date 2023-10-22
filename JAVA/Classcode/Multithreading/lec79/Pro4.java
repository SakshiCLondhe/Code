class Mythread extends Thread{
	static 	Thread nmmain=null;

	public void run(){
	
		try{
		nmmain.join();
		}catch(InterruptedException e){
		}
		for(int i=0;i<10;i++){
		System.out.println("thread-0");

	}
	}
	public static void main(String args [])throws InterruptedException {
		Mythread.nmmain=Thread.currentThread();
        Mythread obj=new Mythread();
	obj.start();
	obj.join();
	for(int i=0;i<10;i++){
		System.out.println("main");
	}


	}
	}
