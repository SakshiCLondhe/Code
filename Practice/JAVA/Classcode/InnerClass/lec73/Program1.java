class MethodLocalInner{
	void m1(){
		System.out.println("in outer m1");
		class Inner{
			void m1(){
			System.out.println("in inner class");
			}
		}
		Inner obj2= new Inner();
		obj2.m1();
	}
	void m2(){
		System.out.println("in outer class m2");
	}
}
class Client{
	public  static void main(String args []){
		MethodLocalInner obj = new MethodLocalInner();
		obj.m1();
		obj.m2();
	}
}

