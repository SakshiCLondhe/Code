//overloading =same class ,same method , diff parameter
class Demo{
	void fun(int x){
		System.out.println(x);
	}
	void fun(float y){
		System.out.println(y);
	}
	void fun(double z){
		System.out.println(z);
	}
	public static void main(String args []){
		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun(10.0);
	}
}
