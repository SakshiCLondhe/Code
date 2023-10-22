class Code6 extends Thread{
	public void run(){
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
		}
		System.out.println(getName());
	}
	public static void main(String arga []){
		Code6 obj= new Code6();
		obj.start();
		System.out.println(obj.getName());
	}
}
