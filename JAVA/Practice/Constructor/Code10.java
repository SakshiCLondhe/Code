 class Destructor{
	public static void main(String args []){
		 Destructor obj1=new Destructor();
		 Destructor obj2=new Destructor();
		 obj1.finalize();
		 
		 obj2=null;
		 System.gc();
		 System.out.println(" inside main()");
	}
	protected void finalize(){
		System.out.println(" obj destroy by gc");
	}
}
