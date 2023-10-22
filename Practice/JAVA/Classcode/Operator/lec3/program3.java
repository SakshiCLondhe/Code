class Logical{
	public static void main(String args[]) {
		int x=5;
		int y=7;
		boolean ans1 =x<y && y<x;  //and operator
		boolean ans2 =x<y || y<x;  //or operator
			System.out.println(ans1);
                       System.out.println(ans2);			
	}
}
