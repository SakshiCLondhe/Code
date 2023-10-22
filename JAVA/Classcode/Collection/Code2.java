import java.util.*;
class Code2{
	public static void main(String args []){
		ArrayList obj = new ArrayList();   // In arrayList Duplicate elements are allowed
						   // sequential order is followeid
		obj.add(10);
		obj.add(20);
		obj.add("hi");
		obj.add('a');
		obj.add(10.5f);
		obj.add(10);
		System.out.println(obj);
		

		//add(int ,Element)
		obj.add(6,'A');
		System.out.println(obj);
	}
}


