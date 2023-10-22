class Demo extends Thread{
	public void run(){
		System.out.println("ThreadName:"+Thread.currentThread().getName());
		
	}
}
class Demo1 extends Thread{
    public void run(){
	    System.out.println("ThreadName:"+Thread.currentThread().getName());
	    System.out.println("in Demo1");
	    Demo  obj1= new Demo();
	    obj1.start();

    }
}
class Client{
	public static void main(String [] a){
	System.out.println("ThreadName:"+Thread.currentThread().getName());
        Demo1 obj = new Demo1();
        obj.start();
}
}
