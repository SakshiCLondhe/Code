// Write a program to find a maximum between three number 
class Assignment6{
	public static void main(String args [])
	{
		int a=42;
		int b=2;
		int c=42;
		if(a>b && a>c){
			System.out.println(a+ "is maximum between  1,2 and 3");
		}
		else if(b>a && b>c){
			System.out.println(b+ "is maximum between  1, 2 and 3");
		}
		else if(c>a && c>b) {
			System.out.println(c+ "is maximum between 1 ,2 and 3");
		}
		else if(a==b  )
				{	
			System.out.println(  "a nd b are equal");
				}
		else if (a==c){
	 		System.out.println(   " a nd c are equal");
			
		}
		else if (b == c){
		System.out.println(" b nd c are equal");
		}
	}
}	
