class Code8 extends Thread {
	public void run(){
			System.out.println("Thread name of code8 class="+Thread.currentThread().getName());
	}
}
class Demo extends Thread
{
			public void run(){
			System.out.println(" Thread name of demo class="+ Thread.currentThread().getName());
			Code8 obj1=new Code8();
			obj1.start();
			}
}
class Mythread{
	public static void main(String args []){
		System.out.println("Thread name of my thread CLass="+Thread.currentThread().getName());
		Demo obj= new Demo();
		obj.start();
	}

}
