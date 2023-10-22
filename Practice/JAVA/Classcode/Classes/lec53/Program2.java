//Static Variable
class StaticDemo1
{
	int x=10;
	static int  y=20;
	void fun()
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void gun()
	{
		System.out.println(y);
	}
}


class Client{
	public static void main(String args [])
	{
        StaticDemo1 sd = new StaticDemo1();
	sd.fun();
	sd.gun();
	}
}


