import java.util.*;
class Movies{
	String Movie=null;
	int Price = 0;
	 Movies(String Movie ,int  Price){
		
		this.Movie=Movie;
		this.Price=Price;

	 
	 }
	 public String toString (){
		return Movie;
	 }
}
class SortByName implements Comparator{
	public int compare(Object obj1 , Object obj2){
	return (((Movies)obj1).Movie.compareTo(((Movies)obj2).Movie));
}}

class UserDemo{

public static void main(String args []){
		 ArrayList ar= new ArrayList();
		 ar.add(new Movies("gadar",300));
		 ar.add(new Movies("Chor",400));
		 System.out.println(ar);
		 Collections.sort(ar,new SortByName());
		 System.out.println(ar);
}
}

