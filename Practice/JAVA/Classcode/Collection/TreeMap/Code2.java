import java.util.*;
class TPDemo implements Comparable {
	String str =null;
	int age=0;
		TPDemo(String str, int age ){
			this.str=str;
			this.age=age;

		}
		public String toString(){
			return str;
		
		}
		public int compareTo(Object obj){

                     return  this.age-((TPDemo)obj).age;
		}
}

class TPDemo1{
	public static void main(String args []){
   ///		TPDemo obj=new TPDemo();
		TreeMap tp = new TreeMap();
		tp.put(new TPDemo("Sakshi",1),"a");
		tp.put(new TPDemo("Pooja",2),"b");
		tp.put(new TPDemo("teju",3),"b");
		System.out.println(tp);
	}
}

	   	
