import java.util.*;
class Movies implements Comparable{

             String MName = null;
	     float TotColl= 0.0f;
	     Movies(String MName, float TotColl){
		     this.MName=MName;
		     this.TotColl=TotColl;
	     }
	     public int compareTo(Object obj1){
		return -(MName.compareTo(((Movies)obj1).MName));
	     }
	     public String toString(){
		return MName;
	     }
}
class  TreesetDemo{
	public static void main(String arg []){
		TreeSet obj = new TreeSet();
		obj.add(new Movies("Dar",180.00f));
		obj.add(new Movies("Omg",200.00f));
		obj.add(new Movies("full3Dhamal",150.00f));
		System.out.println(obj);
	}
}

