class  Mythread implements Runnable{
	public void run(){
		System.out.println("in run");
	}
public static void main(String a[]){
	Mythread obj = new Mythread();
	Thread t= new Thread(obj);
	t.start();
}
}
