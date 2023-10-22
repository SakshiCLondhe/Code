class Mythread implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("in thread-0");

		}
	}
	public static void main(String args []){
		Mythread t= new Mythread();
		Thread t1= new Thread(t);
		t1.start();
		System.out.println("in main");
	}
}

