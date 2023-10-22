class Mythread extends Thread{
	public void run(){
     		System.out.println("in run");
	}
	public static void main(String args []){
		Mythread obj=new Mythread();
		obj.start();
		System.out.println("thread-0");
	}
}


}

