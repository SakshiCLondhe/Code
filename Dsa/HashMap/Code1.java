import java.util.*;
class Code1{
	public static void main(String a[]){
	Map<String ,Integer> mp= new HashMap<>();
	mp.put("sakshi",21);
	mp.put("neha",22);
	mp.put("yashika",18);
	System.out.println(mp);//{sakshi=21,neha=22,yashika=18}
	System.out.println(mp.get("sakshi"));//21
	System.out.println(mp.get("yash"));//null
        System.out.println(mp.put("avni",23));//null
	System.out.println(mp.put("sakshi",20));//21
	System.out.println(mp.containsKey("Sakshi"));
	System.out.println(mp.containsKey("neha"));
	System.out.println(mp.remove("sakshi"));
//	System.out.println(mp.putIfAbsent("yashika",30));
//	mp.putIfAbsent("anyanya",45);
	System.out.println(mp.keySet());
	System.out.println(mp.values());
	System.out.println(mp.entrySet());
	

	}
	}	
		 

