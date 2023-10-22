//buffer Reader
import java.io.*;
class Demo2{
	public static void main (String args [])throws IOException{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       	String name1=br.readLine();
	System.out.println("Batsman name="+name1);	 
        String name2=br.readLine();
        System.out.println("Bawler name="+name2);
	}
}
