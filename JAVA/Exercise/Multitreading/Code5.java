class Code5 extends Thread{
	public void run(){
	  System.out.println(Thread.currentThread().getName());
	}
	public static void main(String rgs []){
		Code5 obj = new Code5();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	}
}


