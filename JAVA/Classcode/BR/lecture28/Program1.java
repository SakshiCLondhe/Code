//Buffer Reader close
import java.io.*;
class Demo3{
	public static void main(String arg [])throws IOException{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		String s1=br1.readLine();
		System.out.println("String="+s1);
		br1.close();
		String s2=br2.readLine();
		System.out.println("String="+s2);
	}
}
