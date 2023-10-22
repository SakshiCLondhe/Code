//Access Specifier
//1-Default
//2-Private
//3-Public
//4-Protected
class Demo{
	int x= 10;                  //Default
	private int y=20;            //Private
        void fun(){                  //Default
		System.out.println(x);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String [] args){
		Demo obj =new Demo();
	         obj.fun();
		 System.out.println(obj.x);
	         System.out.println(obj.y);
                 System.out.println(x);
		 System.out.println(y);
	}
}

