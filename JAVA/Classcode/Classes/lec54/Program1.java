//static block is excute before main method
class StaticDemo{
	static{
	       System.out.println("In static block1");
	}
	public static void main(String args []){
	     System.out.println("in main");
	}
	static{
		System.out.println("In static block2");
	}

}
