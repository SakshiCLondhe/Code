class StaticDemo2{
	static int x=10;
        static{
		System.out.println("in static");
	
		System.out.println(x);
	}

	public static void main(String args []){
		System.out.println(StaticDemo2.x);
		System.out.println("Inmain");
	}
}

