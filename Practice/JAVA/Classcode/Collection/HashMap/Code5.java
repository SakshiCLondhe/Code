import java.util.*;
class Code5{
	public static void main(String args[]){
		HashMap hp = new HashMap();
		hp.put("Sakshi",21);
		hp.put("Pooja",22);
		hp.put("teju",24);
		System.out.println(hp);

		//get()
		System.out.println(hp.get("Sakshi"));//21
		
		//remove()
		System.out.println(hp.remove("Sakshi"));//21
		System.out.println(hp.remove("SAKSHI"));//null
			
		//keySet()
		System.out.println(hp.keySet());


		//value()
		System.out.println(hp.values());

		//entrySet()
		System.out.println(hp.entrySet());
	}
}


