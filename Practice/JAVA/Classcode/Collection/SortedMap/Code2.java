import java.util.*;
class Code2{
	 public static void main(String args []){
		 SortedMap sp=new TreeMap();
		 sp.put("A",65);
		 sp.put("B",66);
		 sp.put("C",67);
		 sp.put("D",68);
		 System.out.println(sp);

		 //subMap
		 System.out.println(sp.subMap("A","C"));  //{A=65,B=66,C=67,D=68}


		 //headMap
		 System.out.println(sp.headMap("D"));{

	 }
}
