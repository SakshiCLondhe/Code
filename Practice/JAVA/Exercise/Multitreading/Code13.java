class Code13 extends Thread{
	public void run(){
		System.out.println(" in run ");
	}
}
class Mythread{
	public static void main(String args [])throws InterruptedException{
		Code13 obj = new Code13();
		obj.start();
		obj.join();
		System.out.println(" in main");
	}
}



