//concurrency methods in java 
//1=Sleep
//2-join
//3=yeild
//1 -sleep
class Mythread extends Thread{
	public void run(){
		try{
		Thread.sleep(120,110);
		}catch(InterruptedException e){
		}
		System.out.println(Thread.currentThread());
	
	}
	public static void main(String args [])throws InterruptedException{
		Mythread obj = new Mythread();
		obj.start();
		Thread.sleep(10,10);
		System.out.println(Thread.currentThread());
	}
}


