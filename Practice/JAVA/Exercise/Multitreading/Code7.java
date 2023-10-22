class  Code6 extends Thread{
	public void run(){
		System.out.println("in run");

		System.out.println(Thread.currentThread().getName());
		System.out.println(" in run");
		
		
	}
      
      	public void start(){
		System.out.println("in start");
		run();

       }
}
class  Mythread{
	public static void main(String rgs []){
		Code6 obj = new Code6();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}


