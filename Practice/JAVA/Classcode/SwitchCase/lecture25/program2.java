class Switchdemo
{
	public static void main(String args []){
		int ch =65;
		switch (ch){
			case 'A':
		        	System.out.println("charA");
			        break;
			case 65:
				System.out.println("num 65");
				break;
			case 'B':
				System.out.println("char B");
				break;
			case 66:
				System.out.println("num 66");
				break;
			default :
			        System.out.println("no matches");
		}
				System.out.println("after switch");
	}
}

