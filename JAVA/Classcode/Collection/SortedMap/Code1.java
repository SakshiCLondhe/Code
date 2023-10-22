//SortedMap
import java.util.*;
class Code1{
	public static void main(String [] a){
		SortedMap obj= new TreeMap();
		obj.put("Java",1);
		obj.put("c",3);
		obj.put("Cpp",2);
		obj.put("python",4);
             	System.out.println(obj);
		     
		//subMap()
		System.out.println(obj.subMap("c","python"));

		//headMap()
		System.out.println(obj.headMap("c"));


	}
}
