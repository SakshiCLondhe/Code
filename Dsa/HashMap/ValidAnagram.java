import java.util.*;
class ValidAnagram
     {
	     public static  boolean areAnagram(String str1 ,String str2){
		if(str1.length()!= str2.length()){
			return false;
		}
		HashMap <Character, Integer> hm = new HashMap();
		for(char c:str1.toCharArray()){
			hm.put(c,hm.getOrDefault(c,0)+1);
		}
		for(char c:str2.toCharArray()){
			if(!hm.containsKey(c)){
				return false;
			}
			hm.put(c,hm.get(c)-1);
			if(hm.get(c)==0){
				hm.remove(c);
			}
		}
		return hm.isEmpty();

		}

	public static void main(String args[]){
		String str1="knee";
		String str2="ken";
		if(areAnagram(str1,str2)){
			System.out.println("are anagram");
		}
		else{
			System.out.println("are not angram");
		}
	}
     }

