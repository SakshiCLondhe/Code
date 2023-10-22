class Mythread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args []){
		Mythread obj= new Mythread();
		obj.start();
		obj.yield();// yield method  is requst to thread Scheduler to give other thread priority to execute
			    // yeild method is not used in programming because its works as  a normal thread
		System.out.println(Thread.currentThread().getName());
	}
}
