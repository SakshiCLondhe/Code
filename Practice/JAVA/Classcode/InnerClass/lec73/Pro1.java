//Static  Inner Class
class OuterClass{
	static class Inner{
	static void  m1(){ 
		System.out.println("in static iiner class");
	}}

public static void main(String [] a){
	OuterClass.Inner.m1();	
	}
}


