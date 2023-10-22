import java.util.*;
class Code1{


	 public static void main(String args []){
		 SortedMap sm= new TreeMap();
		 sm.put("java","JAVA");
		 sm.put("cpp","CPP");
		 sm.put("c","C");
		 System.out.println(sm);

		 Set<Map.Entry>data=sm.entrySet();
		 Iterator <Map.Entry>itr=data.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
			 }
	 }
}
		  
