
 import java.util.*;
 class Code3{
	String CricPlayer=null;
	int jerNo=0;
	Code3(String CricPlayer ,int jerNo){

		this.CricPlayer=CricPlayer;
		this.jerNo=jerNo;
	}
	public String toString(){
	
	
        return CricPlayer;
	}
 }
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){

	return((Code3)obj1).CricPlayer.compareTo(((Code3)obj2).CricPlayer);	

	}}
class UserDemo{

	 public static void main(String args []){
		 TreeMap tm = new TreeMap(new 	SortByName());
		 tm.put(new Code3("Virat",18),"Kohli");
		 tm.put(new Code3("Mahi",7),"Dhoni");
		// Collections.sort(tm,SortByName());
		 System.out.println(tm);
	 }
}

