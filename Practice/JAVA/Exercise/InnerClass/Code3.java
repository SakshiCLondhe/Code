//Static Inner Class 
class Outer {
	  static class Inner
	  {
		  void m1(){
		   System.out.println(" in static inner class ");
	  }
}}
 class Client{

	 public static void main(String arg []){
		 Outer.Inner obj1= new Outer.Inner();
		 obj1.m1();
	 }
 }

