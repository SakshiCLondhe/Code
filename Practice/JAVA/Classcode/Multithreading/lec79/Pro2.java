//2-join
class Mythread extends Thread{
	
	public void run(){
		System.out.println("In thread-0");
	}

      public static void main(String args[])throws InterruptedException{ 
	      Mythread obj=new Mythread();
	      obj.start();
	      obj.join();
	      System.out.println ("in main");
      }
}

		
