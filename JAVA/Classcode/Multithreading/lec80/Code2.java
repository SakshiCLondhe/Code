//Thread Group
class Mythread extends Thread{
	Mythread(String str ){
	}
	public void run(){
		  System.out.println(get.Name());
		System.out.println(Thread.currentThread.getName());
	}
 public static void main(String args []){
	 Mythread obj= new Mythread("XYZ");
	 obj.start();
 }
}

