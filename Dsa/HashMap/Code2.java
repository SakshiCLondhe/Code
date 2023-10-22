//MaxFre
import java.util.*;
class Demo{
	public static void main(String args []){
		int[]arr={1,2,2,3,4,5,6,7,1,1};
	 
		HashMap<Integer, Integer> hm= new HashMap<>();
			for(int el:arr){
				
				if(hm.containsKey(el)){
					hm.put(el,hm.get(el)+1);
				}
				else{
					hm.put(el,1);

			}
			}
			System.out.println(hm);
			int maxfre=0; int anskey=-1;

			for( var obj:hm.entrySet()){
				if(obj.getValue()>maxfre){
					maxfre= obj.getValue();
					anskey=obj.getKey();
	}}
			System.out.println(anskey);
	}
}


