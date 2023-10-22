// method local inner class
import java.util.*;
class Code1Outer{
	 void m1(){
		  System.out.println(" in m1 method ");
		  class Code1Inner{
			  void m3(){
			   System.out.println(" in inner class");
		  }}
		  Code1Inner obj1= new Code1Inner();
		  obj1.m3();

	 }
	 void m2(){
		  System.out.println(" in m2 method ");
	 }

}
class Client{
	 public static void main( String args []){
		Code1Outer obj= new Code1Outer();
		
		     obj.m1();
	       	     obj.m2();
		     
	 }
}




