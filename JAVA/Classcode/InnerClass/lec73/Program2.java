class Outer{
	void m1(){
		System.out.println("hello");

	 int m2(){
		return 0;
			class Inner{
				void m3(){

				System.out.println("hii");
			}}
			Inner obj = new Inner();
		}
	}
}
class Client{
	public static void main(String arg []){
		Outer obj1=new Outer();
	}
}
