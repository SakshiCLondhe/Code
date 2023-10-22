import java.util.*;
class Code7
{
	String str ;
	Code7(String str){

		this.str= str;
	}
	public String toString(){
		return str;
	}
	public void finalize(){
				System.out.println("Notify");
	}
}
class GCDemo{

	public static void main(String args []){
		Code7 obj= new Code7("Sakshi");
//		obj=null;
		Code7 obj1= new Code7("pooja");
		System.out.println(obj1);

		System.out.println(obj);

		WeakHashMap hm = new WeakHashMap();
		hm.put(obj,2018);
		hm.put(obj1,2020);
		//obj1=null;
	
		System.gc();
		System.out.println(hm);


	}
}

