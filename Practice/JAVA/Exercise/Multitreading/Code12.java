class Code12 extends Thread{
	public void run(){
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
		System.out.println(getName());
	}
       public static void main(String []a){

	       Code12 obj= new Code12();
	       obj.start();
       
       }}
