class Code2 extends Thread{
	public void run(){
        	System.out.println("in thread-0");
	}
	public static void main(String args []){
		Code2 obj= new Code2();
		obj.start();
		System.out.println("main");
	}
}
