class Demo{
	static int x= 40;
	static{
            System.out.println("in static block");
	}	
	public static void main(String args []){
		System.out.println("in main");
		Demo obj = new Demo();
		System.out.println(Demo.x);
	}
}
