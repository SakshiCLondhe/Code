/* Four Types Of Inner Class
    1=Normal Inner class
    2= Method local Inner Class
    3=Annonymouse Inner Class
    4=Nested Inner Class
    */
class Outer{
	class Inner{
	 void Fun2(){
		 System.out.println("in fun2-Inner");
	 }
	}
	void Fun1(){
		System.out.println("in Fun1-outer");
		}
}
class Client{
	public static void main(String args []){
		Outer obj = new Outer();
		obj.Fun1();
		Outer.Inner Obj1= obj.new Inner();
		obj1.Fun2();
	}}

