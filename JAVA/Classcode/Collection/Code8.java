import java.util.*;
class Code8 extends ArrayList{
	public static void main(String args []){
		ArrayList obj = new ArrayList();
		obj.add("A");
		obj.add("B");
		obj.add("B");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains("A"));
		System.out.println(obj.contains("D"));
		System.out.println(obj.indexOf("B"));
		System.out.println(obj.lastIndexOf("B"));


	}
}


