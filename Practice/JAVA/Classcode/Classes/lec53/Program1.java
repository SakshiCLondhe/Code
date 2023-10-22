//Static variable and static block
class StaticDemo{
	
    static int x= 10;  //Static block
    static int y=20; //static block

     static  void fun(){
	     System.out.println(x);
		System.out.println(y);
     }
}
class Client{

	public static void main (String sargs []){
	        	System.out.println(StaticDemo.x);
			System.out.println(StaticDemo.y);
			StaticDemo.fun();
        
	}
}
